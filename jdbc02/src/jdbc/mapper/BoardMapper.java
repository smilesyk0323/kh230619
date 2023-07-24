package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BoardDto;

public class BoardMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int idx) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setBoard_no(rs.getInt("board_no"));
		dto.setBoard_title(rs.getString("board_title"));
		dto.setBoard_content(rs.getString("board_content"));
		dto.setBoard_writer(rs.getString("board_writer"));
		dto.setBoard_readcount(rs.getInt("board_readcount"));
		return dto;
	}
	
}
