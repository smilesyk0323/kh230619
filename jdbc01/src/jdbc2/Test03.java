package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.print("제목 변경 : ");
		String boardTitle = sc.nextLine();
		System.out.print("내용 변경 : ");
		String boardContent = sc.nextLine();
		System.out.print("작성자 변경 : ");
		String boardWriter = sc.nextLine();
		sc.close();
		String sql = "update board set board_title = ?, board_content = ?, "
				+ "board_writer = ? where board_no = ?";
		Object[] data = {boardTitle, boardContent, boardWriter, boardNo};

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		
		int result = jdbcTemplate.update(sql, data);
		System.out.println("result = "+ result);
		
		if(result>0) {
			System.out.println("변경 성공");
		}
		else {
			System.out.println("변경 실패");
		}
	}
}
	