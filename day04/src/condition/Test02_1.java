package condition;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[]args) {
		//고3 수험생을 대상으로 이벤트를 진행하기 위해 검사하는 프로그램을 만들려고 합니다
		//출생년도 입력받아서 19살인 경우 ' 이벤트 대상입니다' 출력 아니면 '이벤트 대상이 아닙니다. 출력 
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 4자리:");
		int birth = sc.nextInt();
		
		sc.close();
		
		//계산
		int year = 2023;		
		int age = year - birth + 1;
		
		//출력
		if(age == 19) {
			System.out.println("이벤트 대상입니다");
		}
		else {
			System.out.println("이벤트 대상이 아닙니다");
		}
	}
}
