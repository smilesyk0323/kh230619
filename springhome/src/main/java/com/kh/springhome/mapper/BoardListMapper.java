package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardDto;

@Component
public class BoardListMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(rs.getInt("boardNo"));
		dto.setBoardWriter(rs.getString("boardWriter"));
		dto.setBoardTitle(rs.getString("boardTitle"));
		dto.setBoardReadcount(rs.getInt("boardReadcout"));
		dto.setBoardLikecount(rs.getInt("boardLikecount"));
		dto.setBoardReplycount(rs.getInt("boardReplycount"));
		dto.setBoardCtime(rs.getString("boardCtime"));
		dto.setBoardUtime(rs.getString("boardUtime"));
		return dto;
	}
		

}
