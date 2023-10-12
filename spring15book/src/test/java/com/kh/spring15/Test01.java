package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;



@SpringBootTest
public class Test01 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
//		BookDto dto = new BookDto();
//		dto.setBook_title("테스트제목3");
//		dto.setBook_author("테스트작가3");
//		dto.setBook_publication_date("2019-10-13");
//		dto.setBook_price(50);
//		dto.setBook_publisher("테스트작가3");
//		dto.setBook_page_count(300);
//		dto.setBook_genre("호러");
		
//		BookDto dto = BookDto.builder().book_title("테스트서적").build();
		
		sqlSession.insert("book.add", BookDto.builder()
					.bookTitle("테스트서적4")
					.bookAuthor("테스트작가4")
					.bookPublicationDate("2020-10-11")
					.bookPrice(100)
					.bookPublisher("테스트4")
					.bookPageCount(100)
					.bookGenre("멜로")
					.build());
	}
}





