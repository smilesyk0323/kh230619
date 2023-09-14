package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.PocketmonDto;

public interface PocketmonDao {
	int sequence();
	void insert(PocketmonDto pocketmonDto);
	List<PocketmonDto>selectList();
	PocketmonDto selectOne(int no);
	boolean delete(int no);
	
	void connect(int pocketmonNo, int attachNo);//포켓몬이 메인이기에 포켓몬에서 만들어야함
	AttachDto findImage(int pocketmonNo);
	
}
