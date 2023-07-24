package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bookId = sc.nextInt();
		String bookTitle = sc.nextLine();
		float bookPrice = sc.nextFloat();
		
		String sql = "update book set book_title=?, book_price=? where book_id=?" ;
		Object[]data = {bookTitle, bookPrice};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		int result = jdbcTemplate.update(sql,data);
		
		if(result>0) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
		
	}
}
