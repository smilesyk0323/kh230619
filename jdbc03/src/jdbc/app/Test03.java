package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test03 {
	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		dto.setBookTitle("HarryPotter3");
		dto.setBookPublication_date("2002-06-30");
		dto.setBookPrice(20);
		dto.setBookPublisher("testpublisher");
		dto.setBookPageCount(521);
		dto.setBookGenre("Fantasy");
		
		BookDao dao = new BookDao();
		dao.insert(dto);
		
		System.out.println("등록완료!");
		
	}
}
