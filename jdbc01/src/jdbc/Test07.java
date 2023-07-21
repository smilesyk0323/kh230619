package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호");
		int board_no = sc.nextInt();
		System.out.print("제목: ");
		String board_title = sc.next();
		System.out.print("내용 작성: ");
		String board_content = sc.next();
		System.out.print("작성자: ");
		String board_writer = sc.next();
		int board_readcount = 100 ;
		
		sc.close();
		
		String sql = "insert into board(board_no, board_title, board_content, "
				            + "board_writer, board_readcount)"
				            + "values(?,?,?,?,?)";
		
		Object[]data = {board_no,board_title, board_content, board_writer,
				                  board_readcount};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,data);
		
		System.out.println("게시물이 작성되었습니다");
	}
}
