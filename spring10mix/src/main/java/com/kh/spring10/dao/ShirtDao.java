package com.kh.spring10.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.mapper.ShirtMapper;

@Repository
public class ShirtDao {
	@Autowired
	private JdbcTemplate jdbcTemaplate;
	
	private ShirtMapper mapper;
	
	//등록
	public int sequence() {
		
	}

}
