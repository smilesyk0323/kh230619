package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		BookDto dto = new BookDto();
		dto.setBookId(2);
		dto.setBookTitle("테스트제목8");
		dto.setBookAuthor("테스트작가8");
		dto.setBookPublicationDate("2000-08-08");
		dto.setBookPrice(80);
		dto.setBookPublisher("테스트출판사8");
		dto.setBookPageCount(800);
		dto.setBookGenre("테스트8");
		
		int count = sqlSession.update("book.edit",dto);
		boolean result = count > 0;
		log.debug("result = {}", result);
	}

}
