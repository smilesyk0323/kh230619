package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[]args) {
		//신규 도서 등록 프로그램(ex: 도서관, 책방)
		
		
		
		//데이터 - book_id는 준비하지 않는다(시퀀스 활용)
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 : ");
		String bookTitle = sc.nextLine();
		System.out.print("지은이 : ");
		String bookAuthor = sc.nextLine();
		System.out.print("출간일 : ");
		String bookPublicationDate = sc.nextLine();
		System.out.print("판매가($) : ");
		float bookPrice = sc.nextFloat();
		System.out.print("출판사 : ");
		String bookPublisher = sc.nextLine();
		sc.nextLine();// nextLine 오류로 생성 
		System.out.print("페이지수 : ");
		int bookPageCount = sc.nextInt();
		System.out.print("장르 : ");
		String bookGenre = sc.nextLine();
		sc.close();
		
		
		//DB 처리 
		String sql = "insert into book(book_id,book_title,book_author,book_publication_date"
				          + "book_price, book_publisher,book_page_count,book_genre)"
				          + "values(book_seq.nextval,?,?,?,?,?,?,?)";
		
		Object[] data = {
				bookTitle, bookAuthor, bookPublicationDate,
				bookPrice, bookPublisher, bookPageCount, bookGenre
			};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,data);
		
		System.out.println("책이 등록되었습니다");
	}
}





















