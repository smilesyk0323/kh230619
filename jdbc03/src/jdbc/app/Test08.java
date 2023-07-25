package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test08 {
	public static void main(String[] args) {
		//도서 가격 수정 프로그램
		
		//데이터
		BookDto dto = new BookDto();
		dto.setBookId(6);
		dto.setBookPrice(5.71f);
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookPrice(dto);
		
		if(result) {
			System.out.println("가격변경완료");
		}
		else {
			System.out.println("존재하지 않는도서번호");
		}
	}
}
