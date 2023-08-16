package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.mapper.BoardListMapper;
import com.kh.springhome.mapper.BoardMapper;

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
					+ "board_writer) values(?,?,?,?)";
			Object[] data = {
					dto.getBoardNo(), dto.getBoardTitle(),
					dto.getBoardContent(), dto.getBoardWriter()
			};
			jdbcTemplate.update(sql,data);
		}
		
		//목록(비회원 접근 가능)
		@Override
		public List<BoardDto> selectList(BoardDto boardDto) {
			String sql = "select "
					+ "board_no, board_writer, board_title, "
					+ "board_readcount, board_likecount, "
					+ "board_replycount, board_ctime, "
					+ "board_utime "
					+ "from board order by board_no desc";
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

		
		@Override
		public Integer selectMax(String boardWriter) {//null때문에 integer로 
			String sql = "select max(board_no) from board "
							+ "where board_writer = ?";
			//DB계산시  and board_ctime >= sysdate-5/60/60/24(5분전)
			Object[] data = {boardWriter};
			return jdbcTemplate.queryForObject(sql, Integer.class,data);
		}
		
			



		
		

}
