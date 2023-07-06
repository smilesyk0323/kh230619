package api.lang.string;

import java.util.Scanner;


public class Test02 {
	public static void main(String[] args) {

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("Password : ");
		String pw = sc.next();
		sc.close();

		//계산 - 대문자/소문자 변환하여 비교
		boolean isLogin = id.toLowerCase().equals("khacademy") && pw.equals("student1234");

		//출력
		if(isLogin) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("정보가 일치하지 않습니다");
		}

	}
}