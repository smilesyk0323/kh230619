package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
		void insert(BoardDto boarddto);
		int sequence();
		List<BoardDto> selectList();
		
	
}
