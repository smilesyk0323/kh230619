package com.kh.spring18.dao;

import com.kh.spring18.dto.SecureMemberDto;

public interface SecureMemberDao {
	void insert(SecureMemberDto dto);
	SecureMemberDto selectOne(String memberId);//단순 단일 조회
	SecureMemberDto login(SecureMemberDto dto);//암호화된 비번 로그인기능
}
