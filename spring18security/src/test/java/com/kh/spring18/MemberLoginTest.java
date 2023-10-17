package com.kh.spring18;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberLoginTest {

	@Autowired
	private SecureMemberDao dao;
	
	@Test
	public void test() {
		//로그인 테스트 
		SecureMemberDto dto = SecureMemberDto.builder()
						.memberId("testuser1").memberPw("Testuser123")//방금입력한 비번
						.build();
		
		SecureMemberDto target = dao.login(dto);//이미 암호화 확인 끝나고 불러옴
		log.debug("target = {}", target);
		
		assertNotNull(target);//target이 not null이면 테스트 성공

	}
	
}



















