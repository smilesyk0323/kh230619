package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.ClientDto;

public interface ClientDao {//회원
		void insert(ClientDto ClientDto);//등록
		List<ClientDto> selectList();//목록
		ClientDto selectOne(String clientId);//상세
		boolean updateClientEdit(ClientDto clientDto);//수정
		boolean deleteClient(String clentId);//삭제	
}
