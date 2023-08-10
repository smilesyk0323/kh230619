package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardDto;

@Component
public class BoardMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(rs.getInt("board_no"));
		dto.setBoardWriter(rs.getString("board_writer"));
		dto.setBoardTitle(rs.getString("board_title"));
		dto.setBoardContent(rs.getString("board_content"));
		dto.setBoardReadcount(rs.getInt("board_readcout"));
		dto.setBoardLikecount(rs.getInt("board_likecount"));
		dto.setBoardReplycount(rs.getInt("board_replycount"));
		dto.setBoardCtime(rs.getString("board_ctime"));
		dto.setBoardUtime(rs.getString("board_utime"));
		return dto;
	}

}
