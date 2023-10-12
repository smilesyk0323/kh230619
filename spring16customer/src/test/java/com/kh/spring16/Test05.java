package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test05 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int count = sqlSession.update("customer.edit", CustomerDto.builder()
						.customerId("testuser2")
						.customerContact("010-9999-9999")
						.customerJoin("2000-02-02")
						.customerPurchase("1999-11-11")
						.customerMileage(1000)
						.customerLevel("VVIP")
						.customerNo(1)
						.build());
		log.debug("count = {}", count);
	}
}
