package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.util.JdbcUtils;
//게시글을 CRUD 처리하는 도구 
public class BoardDao {

		public void insert(int boardNo, String boardTitle, String boardContent,
				                   String boardWriter	) {
			String sql = "insert into board(board_no, board_title, board_content, "
								+ "board_writer, board_readcount) "
								+ "values(?,?,?,?,0)";
			Object[] data = {boardNo, boardTitle, boardContent, boardWriter };
			
			JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
			jdbcTemplate.update(sql,data);
		}

		//바람직한 형태의 등록 메소드 
		public void insert(BoardDto dto) {
			String sql = "insert into board(board_no, board_title, board_content, "
					+ "board_writer, board_readcount) "
					+ "values(?,?,?,?,0)";
			Object[] data = {dto.getBoardNo(), dto.getBoardTitle(), dto.getBoardContent(), dto.getBoardWriter() };
			
			JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
			jdbcTemplate.update(sql,data);
		}
		
		public boolean update(BoardDto dto) {
			String sql = "update board set  board_title =?,"
								+ "board_content = ?  where board_no =?";
			Object[] data = {
					dto.getBoardTitle(), dto.getBoardContent(), dto.getBoardNo()
			};
		
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql,data);
		
		return result > 0;
		
}

}
