package com.kh.springhome.dao;

import com.kh.springhome.dto.PocketmonDto;

public interface PocketmonDao {
	int sequence();
	void insert(PocketmonDto pocketmonDto);
	void connect(int pocketmonNo, int attachNo);//포켓몬이 메인이기에 포켓몬에서 만들어야함
}
