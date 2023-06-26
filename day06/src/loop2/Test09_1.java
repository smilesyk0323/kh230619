package loop2;

import java.util.Scanner;

public class Test09_1 {
	public static void main(String[]args) {
		//사용자에게 숫자를 10개를 입력 받음 
		//1.홀수의 개수 
		//2.짝수의 개수 
		//3.전체 합계
		//4.전체 평균 
		
		//1번 입력 
		
		Scanner sc = new Scanner(System.in);
		
		int odd = 0;
		
		for(int i= 0; i < 10; i++) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
			
			if(number % 2 != 0) {
				odd++;
			}
		}
				
		sc.close();
		
		System.out.println("홀수의 개수 = "+odd);

	}
	
}
