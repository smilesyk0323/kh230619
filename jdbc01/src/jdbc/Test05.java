package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[]args) {
		//계좌 개설 프로그램 
		//= 계좌를 개설한다는 것은 Account테이블에 데이터를 INSERT하는 것이다
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("예금주: ");	
		String account_owner = sc.next();// accountOwner 자바식 표기 가능(언더바 없이)
		System.out.print("예금기간(년): ");	
		int account_period = sc.nextInt();
//		int account_count = account_period*12 +1;
		int account_count = 1;
		System.out.print("1회 예금액: ");	
		int account_payment = sc.nextInt();
		int account_balance = 0;
		
		sc.close();
		
		//DB 처리 
		String sql = "insert into account(account_owner, account_period, "
				          + "account_count, account_payment, account_balance)"
				                +"values(?,?,?,?,?)";//DB명령어라 자바식 표기 불가 
		
		Object[]data = {account_owner, account_period, account_count, account_payment, account_balance};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();//연결도구
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");// 달라지지 않는 구문이라 정 안되면 복붙하면서 사용해도 무방
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);//실행도구
		jdbcTemplate.update(sql,data);
		
		System.out.println("계좌가 개설되었습니다");
	}
}
