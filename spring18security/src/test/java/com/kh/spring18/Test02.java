package com.kh.spring18;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02 {
	
	@Test
	public void test() {
		int number = 5;
		
		number *= 12345;
		number += 12345;
		number *= 12345;	
		number %= 123456789;//number를 7이던 5이던 1이 나옴
		
		log.debug("number = {}", number);
	}

}



















