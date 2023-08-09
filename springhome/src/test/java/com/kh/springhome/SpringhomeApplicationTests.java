package com.kh.springhome;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.springhome.dao.MemberDao;

@SpringBootTest
class SpringhomeApplicationTests {
	
	@Autowired
	private MemberDao memberDao;

	@Test
	void contextLoads() {
		assertNotNull(memberDao);
	}

}
