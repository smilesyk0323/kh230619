package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
		void insert(BoardDto boardDto);
		int sequence();
		List<BoardDto> selectList(BoardDto boardDto);
		BoardDto selectOne(String boardNo);
		boolean updateBoardEdit(BoardDto boardDto);
		
	
}
