package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원아이디: ");
		String member_id = sc.nextLine();
		System.out.print("회원비밀번호: ");
		String member_pw = sc.nextLine();
		System.out.print("회원닉네임: ");
		String member_nickname = sc.nextLine();
		System.out.print("회원생년월일: ");
		String member_birth = sc.nextLine();
		System.out.print("회원메일주소: ");
		String member_email = sc.nextLine();
		System.out.print("회원연락처: ");
		String member_contact = sc.nextLine();
		System.out.print("회원등급: ");
		String member_level = sc.nextLine();
		System.out.print("회원포인트: ");
		String member_point = sc.nextLine();
		System.out.print("회원가입일: ");
		String member_join = sc.nextLine();
		
		sc.close();
		
		String sql = "insert into member(member_id, member_pw, member_nickname, "
				+ "member_birth, member_email, member_contact, member_level, "
				+ "member_point, member_join) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		
		Object[]data = {member_id, member_pw, member_nickname, member_birth, member_email, member_contact, 
								member_level, member_point, member_join};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,data);
		
		System.out.println("회원정보등록!");
		
	}

}
