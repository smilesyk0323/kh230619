package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.ItemDto;


public interface ItemDao {//상품
		int sequence();//시퀀스
		void insert(ItemDto itemDto);//등록
		List<ItemDto> selectList();//목록
		ItemDto selectOne(int itemNo);//상세
		boolean updateClientEdit(ItemDto itemDto);//수정
		boolean deleteClient(int itemNo);//삭제	
}
