package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

@SpringBootTest
public class Test01 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		sqlSession.insert("customer.save", CustomerDto.builder()
				.customerId("testuser3")
				.customerContact("010-2222-3333")
				.customerJoin("1999-01-01")
				.customerPurchase("2023-10-12")
				.customerMileage(2000)
				.customerLevel("VIP")
				.build());
	}
	
}
