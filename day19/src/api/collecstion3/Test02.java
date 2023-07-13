package api.collecstion3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test02 {
public static void main(String[] args) {
		Map<String,String> user = new TreeMap<>();
		
		user.put("admin","admin1234");
		user.put("teacher","teacher1234");
		user.put("student","student1234");
		user.put("manger","manager1234");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디입력:");
		String id = sc.next();
		System.out.print("비밀번호입력:");
		String pass = sc.next();
		
		sc.close();
		
		
//		if(user.containsKey(id)&&user.containsValue(pass)) {
		//잘못된 표현 : 다른 사람 비밀번호를 입력하면 로그인됨... 
//		System.out.println("로그인성공!");
//	}
//	else {
//		System.out.println("로그인 실패!");
//	}
		if(user.containsKey(id)&&pass.equals(user.get(id))) {//올바른 표현
		System.out.println("로그인성공!");
	}
	else {
		System.out.println("로그인 실패!");
	}
	
}
}
