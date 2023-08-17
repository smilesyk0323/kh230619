package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;

public interface BoardDao {
		int sequence();//시퀀스
		void insert(BoardDto boardDto);//입력
		BoardDto selectOne(int boardNo);//상세
		boolean updateRcount(int boardNo);//조회수 증가 
		boolean deleteBoard(int boardNo);//삭제
		boolean updateBoardEdit(BoardDto boardDto);//수정		
		Integer selectMax(String boardWriter);//가장 마지막 작성글 조회

		List<BoardListDto> selectList(BoardDto boardDto);//목록
		List<BoardListDto> selectList(String type, String keyword);//검색창 구현
}

