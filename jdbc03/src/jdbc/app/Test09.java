package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {
	public static void main(String[] args) {
		//도서명, 출판사, 저자 변경 프로그램(도서 기본정보)
		
		//데이터 
		BookDto dto = new BookDto();
		dto.setBookId(5);
		dto.setBookTitle("테스트제목");
		dto.setBookAuthor("테스트저자");
		dto.setBookPublisher("테스트출판사");
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookInfo(dto);
		
		if(result) {
			System.out.println("도서정보 변경 완료");
		}
		else {
			System.out.println("도서번호가 없습니다");
		}
	}
}
