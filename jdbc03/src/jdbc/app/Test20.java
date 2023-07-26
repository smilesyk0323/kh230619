package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test20 {
	public static void main(String[] args) {
		int bookId = 3;
		
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		if(dto==null) {
			System.out.println("찾으시는 번호의 도서정보가 없습니다");
		}
		else {
			System.out.println(dto);
		}
	}
}
