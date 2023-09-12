package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kh.springhome.dto.BoardLikeDto;

public class BoardLikeMapper implements RowMapper<BoardLikeDto>{

	@Override
	public BoardLikeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardLikeDto boardLikeDto = new BoardLikeDto();
		boardLikeDto.setMemberId(rs.getString("member_id"));
		boardLikeDto.setBoardNo(rs.getInt("board_no"));
		return boardLikeDto;
	}

}
