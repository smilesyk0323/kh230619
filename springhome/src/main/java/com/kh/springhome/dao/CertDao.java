package com.kh.springhome.dao;

import com.kh.springhome.dto.CertDto;

public interface CertDao {
	void insert(CertDto certDto);
	boolean delete(String certEmail);
	boolean deleteOver5min();
	CertDto selectOne(String certEmail);
	CertDto selectOneIn5min(String certEmail);//인증번호 유효시간설정
}
