package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BasketDto;


public interface BasketDao {//장바구니
		int sequence();//시퀀스
		void insert(BasketDto basketDto);//등록
		List<BasketDto> selectList();//목록
		BasketDto selectOne(int basketNo);//상세
		boolean updateClientEdit(BasketDto basketDto);//수정
		boolean deleteClient(int basketNo);//삭제	
}
