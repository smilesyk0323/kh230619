package loop2;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		// 구구단 게임
		// 1. 사용자에게 원하는 단을 입력받으면 해당 단의 구구단을 출력
		// 2. 정답을 지우고 사용자에게 정답을 입력 받아서 정답/ 오답 판정 후 출력
		// 3. 정답과 오답의 개수를 세어 모든 문제 출제 후 풀력
		// 단: 3 -> 1)3단 구구단 전체 출력
		// 2) 3 X 1 = ??? 정답 인지 오답인지 출력
		// 3) 정답 : 5개 / 오답 : 4개
		// 연속 정답시 콤보 개수를 출력 

		//[1]구구단 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		
		int ok = 0;//반복문 전에 사용 
		int nok = 0;
		int combo = 0;
		
		for(int i = 1; i<= 9; i++){//1부터 9까지 
			System.out.println( dan + "x" + i + "="+ dan * i );
			int user = sc.nextInt();
			
			if(dan * i == user) {
				System.out.println("정답");
				ok++;
				combo++;
				System.out.println(combo + "콤보!");
			}
			else {
				System.out.println("오답");
				nok++;
				combo = 0;
			}		
			
			}		
			sc.close();
			
				System.out.println("정답 수 : "+ok+"개");
				System.out.println("오답 수 : "+nok+"개");
				
				//콤보 = 연속으로 맞춘 횟수(카운트)
				       //= 틀리면 0 
	}

}
