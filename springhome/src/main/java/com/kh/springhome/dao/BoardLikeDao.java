package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardLikeDto;

public interface BoardLikeDao {
	
	//복합키로 구성된 테이블이므로 기본키 대신 DTO를 사용
	void insert(BoardLikeDto boardLikeDto);
	boolean delete(BoardLikeDto boardLikeDto);
	boolean check(BoardLikeDto boardLikeDto);//값이 아닌 있는지 여부만 알면 됨
	int count(int boardNo);//게시글 번호로 좋아요 개수 확인
	List<BoardDto> findByMemberId(String memberId);//많은 정보를 얻으려면 boardLikeDto가 아닌 BoardListDto!
}
