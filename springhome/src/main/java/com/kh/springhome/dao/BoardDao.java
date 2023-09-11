package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.vo.PaginationVO;

public interface BoardDao {
		int sequence();//시퀀스
		void insert(BoardDto boardDto);//입력
		BoardDto selectOne(int boardNo);//상세
		boolean updateRcount(int boardNo);//조회수 증가 
		boolean deleteBoard(int boardNo);//삭제
		boolean updateBoardEdit(BoardDto boardDto);//수정		
		Integer selectMax(String boardWriter);//가장 마지막 작성글 조회

		List<BoardListDto> selectList();//목록
		List<BoardListDto> selectList(String type, String keyword);//검색창 구현
		
		List<BoardListDto>selectListByPage(int page);// 페이징
		List<BoardListDto>selectListByPage(String type, String keyword, int page);//페이징(검색)
		int countList();//갯수를 구하는 명령(목록)
		int countList(String type, String keyword);//갯수를 구하는 명령(검색)
				
		List<BoardListDto> selectListByPage(PaginationVO vo);//(모듈화)페이징 - 목록 구하는
		int countList(PaginationVO vo);//(모듈화)페이징- 갯수 구하는
			
		//특정 사용자(매개변수)가 작성한 글을 조회(list)하는 메소드
		List<BoardListDto> selectListByBoardWriter(String boardWriter);
		
		boolean updateBoardReplycount(int boardNo);
}
