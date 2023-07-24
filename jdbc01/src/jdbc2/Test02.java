package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//데이터 
		int bookId = sc.nextInt();
		String bookTitle = sc.nextLine();
		float bookPrice = sc.nextFloat();
		
		//DB처리- 자바는 자동 commit 모드를 사용한다 
		String sql = "update book set book_title=?, book_price=? where book_id=?" ;
		Object[]data = {bookTitle, bookPrice,bookId};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		int result = jdbcTemplate.update(sql,data);
		
		if(result>0) {//결과 행 개수로 성공 /실패 확인 
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}		
	}
}
