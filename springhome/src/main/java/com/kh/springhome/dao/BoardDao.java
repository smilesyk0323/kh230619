package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
		int sequence();
		void insert(BoardDto boardDto);
		List<BoardDto> selectList(BoardDto boardDto);
		BoardDto selectOne(int boardNo);
		boolean updateRcount(int boardNo);//조회수 증가 
		boolean updateBoardEdit(String boardTitle, String boardContent, int boardNo);
		boolean deleteBoard(int boardNo);
}


