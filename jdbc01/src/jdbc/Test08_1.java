package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08_1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원아이디: ");
		String customerId = sc.next();
		System.out.print("회원연락처: ");
		String customerContact = sc.next();
		System.out.print("회원가입일: ");
		String customerJoin = sc.next();
		String customerPurchase = "2023-07-21";
		int customerMileage = 0;
		String customerLevel = "일반";
		
		sc.close();
		
		String sql = "insert into customer(customer_no, customer_id, customer_contact, customer_join, "
				+ "customer_purchase, customer_mileage, customer_level)"
				+ "values(customer_seq.nextval,?,?,?,?,?,?)";
		
		Object[]data = {customerId, customerContact,customerJoin, customerPurchase, customerMileage,
				               customerLevel	};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,data);
		
		System.out.println("고객정보등록!");
	}
}
