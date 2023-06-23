package loop;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[]args) {
		//(주의) 도구 생성은 한번만 		
		Scanner sc = new Scanner(System.in);
		
		for(int  i=0; i<5; i++) {
			System.out.print("숫자 입력: ");
			int a = sc.nextInt();
		}

		sc.close();
	
	}	
}
