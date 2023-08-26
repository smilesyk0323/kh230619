package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.mapper.BoardListMapper;
import com.kh.springhome.mapper.BoardMapper;
import com.kh.springhome.vo.PaginationVO;



@Repository
public class BoardDaoImpl implements BoardDao{
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private BoardMapper detailMapper;
		
		@Autowired
		private BoardListMapper listMapper;
		
		//등록 [1]번호 생성 
		@Override
		public int sequence(){
			String sql = "select board_seq.nextval from dual";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
		
		//등록
		@Override
		public void insert(BoardDto dto) {
			String sql = "insert into board("
					+ "board_no, board_title, board_content, "
					+ "board_writer,board_group, board_parent, board_depth"
					+ ") values(?,?,?,?,?,?,?)";
			Object[] data = {
					dto.getBoardNo(), dto.getBoardTitle(),
					dto.getBoardContent(), dto.getBoardWriter(),
					dto.getBoardGroup(), dto.getBoardParent(),
					dto.getBoardDepth()
			};
			jdbcTemplate.update(sql,data);
		}
		
		//[1]목록(비회원 접근 가능)
		@Override
		public List<BoardListDto> selectList() {
			//기존 조회 구문 
//			String sql = "select * from board_list order by board_no desc";
			
			//계층형 조회 구문
			String sql = "select * from board_list "
							+ "connect by prior board_no = board_parent "
							+ "start with board_parent is null "
							+ "order siblings by board_group desc, board_no asc";
			return jdbcTemplate.query(sql, listMapper);
		}

		//상세 (비회원 접근가능)
		@Override
		public BoardDto selectOne(int boardNo) {
			String sql = "select * from board where board_no = ? ";
			Object[] data = {boardNo};
			List<BoardDto>list = jdbcTemplate.query(sql, detailMapper,data);
			return list.isEmpty() ? null : list.get(0);
		}

		//조회수 증가 
		@Override
		public boolean updateRcount(int boardNo) {
			String sql = "update board set "
					+ "board_readcount = board_readcount + 1 "
					+ "where board_no=? ";
			Object[] data = {boardNo};
			return jdbcTemplate.update(sql,data)>0;
		}

		//삭제
		@Override
		public boolean deleteBoard(int boardNo) {
			String sql = "delete board where board_no = ?";
			Object[] data = {boardNo};
			return jdbcTemplate.update(sql, data)>0;
		}
		
		//수정
		@Override
		public boolean updateBoardEdit(BoardDto boardDto) {
				String sql = "update board set "
								+ "board_title = ?, board_content =?, board_utime = sysdate "
								+ "where board_no = ?";
				Object[] data = {
						boardDto.getBoardTitle(), boardDto.getBoardContent(),
						boardDto.getBoardNo()
				};
				return jdbcTemplate.update(sql, data) > 0;
		}

		//마지막 작성글 조회 
		@Override
		public Integer selectMax(String boardWriter) {//null때문에 integer로 
			String sql = "select max(board_no) from board "
							+ "where board_writer = ?";
			//DB계산시  and board_ctime >= sysdate-5/60/60/24(5분전)
			Object[] data = {boardWriter};
			return jdbcTemplate.queryForObject(sql, Integer.class,data);
		}
		
		//검색창 구현 
//		@Override //비추천
//		public List<BoardDto> selectLIst(String type, String keyword) {
//			String sql;
//					if(type.equals("board_title")) {//type이 제목인 경우
//						sql = "select * from board "
//								+ "where instr(board_title, ?) > 0 "
//								+ "order by board_no desc";
//					}
//					else {//type이 작성자인 경우 
//						sql = "select * from board "
//								+ "where instr(board_writer, ?) > 0 "
//								+ "order by board_no desc";
//					}
//			Object[] data = {keyword};
//			return jdbcTemplate.query(sql, listMapper,data);
//		}
		
		@Override//아래 구문도 사용 가능 
		public List<BoardListDto> selectList(String type, String keyword) {
			String sql = "select * from board_list "
					+ "where instr("+type+", ?) > 0 "
					+ "connect by prior board_no = board_parent "
					+ "start with board_parent is null "
					+ "order siblings by board_group desc, board_no asc";
			Object[] data = {keyword};
			return jdbcTemplate.query(sql, listMapper,data);
		}


//		@Override
//		public List<BoardDto> selectLIst(String type, String keyword) {
//			String sql = "select * from board "
//								+ "where instr(#1, ?) > 0 "
//								+ "order by board_no desc";
//			sql = sql.replace("#1",type);//#은 아무의미 없음/임의의 절대 안나올 글자를 적어둠
//			Object[] data = {keyword};
//			return jdbcTemplate.query(sql, listMapper,data);
//		}

		//페이징 추가 된 목록 
		@Override
		public List<BoardListDto> selectListByPage(int page) {
			int begin  = page * 10 - 9;			
			int end = page * 10;
			String sql = "select * from ("
								+ " select rownum rn, TMP.*from("
										+ "select * from board_list "
										+ "connect by prior board_no = board_parent "
										+ "start with board_parent is null "
										+ "order siblings by board_group desc, board_no asc"
								+ ")TMP"
							+ ")where rn between ? and ?";
			Object[] data = {begin, end};		
			return jdbcTemplate.query(sql, listMapper, data);
		}

		@Override
		public List<BoardListDto> selectListByPage(String type, String keyword, int page) {
			int begin  = page * 10 - 9;			
			int end = page * 10;
			String sql =  "select * from ("
							+ " select rownum rn, TMP.*from("
									+ "select * from board_list "
									+ "where instr("+type+", ?) > 0 "
									+ "connect by prior board_no = board_parent "
									+ "start with board_parent is null "
									+ "order siblings by board_group desc, board_no asc"
							+ ")TMP"
							+ ")where rn between ? and ?";
			Object[] data = {keyword, begin, end};
			return jdbcTemplate.query(sql, listMapper,data);
		}

		//게시글 갯수를 구하는 구문
		@Override
		public int countList() {
			String sql = "select count(*) from board";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
		
		@Override
		public int countList(String type, String keyword) {
			String sql = "select count(*) from board "
							+ "where instr("+type+",?) > 0";
			Object[] data = {keyword};
			return jdbcTemplate.queryForObject(sql, int.class, data);
		}

		//페이징 모듈화
		@Override
		public int countList(PaginationVO vo) {
			if(vo.isSearch()) {//검색
				String sql = "select count(*) from board "
						+ "where instr("+vo.getType()+",?) > 0";
				Object[] data = {vo.getKeyword()};
				return jdbcTemplate.queryForObject(sql, int.class, data);
			}
			else{//목록
				String sql = "select count(*) from board";
				return jdbcTemplate.queryForObject(sql, int.class);
			}
		}
		
		
		@Override
		public List<BoardListDto> selectListByPage(PaginationVO vo) {
			if(vo.isSearch()) {//옆에 애를 controller에 사용하지 않겠다! 
				return selectListByPage(vo.getType(), vo.getKeyword(), vo.getPage());
			}
			else {
				return selectListByPage(vo.getPage());
			}
		}

		@Override
		public List<BoardListDto> selectListByBoardWriter(String boardWriter) {
			String sql = "select * from board_list "
								+ "where board_writer = ? "
								+ "order by board_no desc";
			Object[] data = {boardWriter};
			return jdbcTemplate.query(sql, listMapper,data);
		}
		
}
		


