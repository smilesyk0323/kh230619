package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// 구구단 게임
		// 1. 사용자에게 원하는 단을 입력받으면 해당 단의 구구단을 출력
		// 2. 정답을 지우고 사용자에게 정답을 입력 받아서 정답/ 오답 판정 후 출력
		// 3. 정답과 오답의 개수를 세어 모든 문제 출제 후 풀력
		// 단: 3 -> 1)3단 구구단 전체 출력
		// 2) 3 X 1 = ??? 정답 인지 오답인지 출력
		// 3) 정답 : 5개 / 오답 : 4개

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	    int count =0;
		for (int i = 1; 9 >= i; i++) {

			System.out.print(number + "x" + i + " =" );
			
			int enter = sc.nextInt();
			if (enter == number * i) {
				System.out.println("정답");
				
			} 
			else {
				System.out.println("오답");
				}
			if( enter == number * i ) {
				count++;
				}		
			}
			  sc.close();				
		 
			System.out.println("정답 수: "+ count +"개");
			System.out.println("오답 수: "+ (9 - count)+ "개");
						
			
	}

}
