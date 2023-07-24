package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07_1 {
	public static void main(String[] args) {
		//게시글 등록 프로그램
		
		//데이터
		Scanner sc = new Scanner(System.in);
		System.out.println("제목 입력");
		String boardTitle = sc.nextLine();
		System.out.println("내용 입력");
		String boardContent = sc.nextLine();
		System.out.println("작성자 입력");
		String boardWriter = sc.nextLine();
		sc.close();
		
		//구문
		String sql = "insert into board("
							+ "board_no, board_title, board_content, "
							+ "board_writer, board_readcount"
						+ ") "
						+ "values(board_seq.nextval, ?, ?, ?, 0)";
		Object[] data = {boardTitle, boardContent, boardWriter};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("게시글 작성 완료");
	}
}
