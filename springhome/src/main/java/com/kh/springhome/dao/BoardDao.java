package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
		void insert(BoardDto boardDto);
		int sequence();
		BoardDto selectOne(int boardNo);
		List<BoardDto> selectList(BoardDto boardDto);
		boolean updateBoardEdit(String boardTitle, String boardContent, int boardNo);
		boolean deleteBoard(int boardNo);
		boolean updateRcount(int boardNo);
	
}


