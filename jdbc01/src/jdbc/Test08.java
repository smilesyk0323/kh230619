package jdbc;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String member_id = sc.nextLine();
		String member_pw = sc.nextLine();
		String member_nickname = sc.nextLine();
		String member_birth = sc.nextLine();
		String member_email = sc.nextLine();
		String member_contact = sc.nextLine();
		String member_level = sc.nextLine();
		String member_point = sc.nextLine();
		String member_join = sc.nextLine();
		
		sc.close();
		
		String sql = "insert into member(member_id, member_pw, member_nickname, "
				+ "member_birth, member_email, member_contact, member_level, "
				+ "member_point, member_join) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		
		Object[]data = {};
		
	}

}
