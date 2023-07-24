package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08_1 {
	public static void main(String[] args) {
		//회원 가입 프로그램
		
		//데이터 - 6개(아이디,비밀번호,닉네임,생년월일,이메일,연락처)
		//(TIP) 오라클에 추가하는 문자열은 null이든 ""이든 모두 null로 추가됨
		String memberId = "testuser23";
		String memberPw = "Testuser23!";
		String memberNick = "테스트유저23";
		String memberBirth = "2020-01-01";
		String memberEmail = "";
		String memberContact = "01012345678";
		
//		DB처리
//		String sql = "insert into member("
//							+ "member_id, member_pw, member_nickname, "
//							+ "member_birth, member_email, member_contact,"
//							+ "member_level, member_point, member_join"
//						+ ") values(?, ?, ?, ?, ?, ?, '일반', 0, sysdate)";
		String sql = "insert into member("
							+ "member_id, member_pw, member_nickname, "
							+ "member_birth, member_email, member_contact"
						+ ") values(?, ?, ?, ?, ?, ?)";
		Object[] data = {
				memberId, memberPw, memberNick,
				memberBirth, memberEmail, memberContact
		};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("회원 가입 완료");
	}
}
