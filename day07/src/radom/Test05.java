package radom;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[]args) {
		//2단 부터 9단 사이 구구단 문제 10개 출제
		//사용자 입력한 값으로 정답 오답 판정 
		//모든 문제가 출제후 정답과 오담개수 출력 
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count =0;
		int count2 =0;
		
		for(int i =0; i<10; i++) {
		int dan1 = r.nextInt(8)+2;
		int dan2 = r.nextInt(8)+2;
		
		
		
		System.out.print(dan1+"x"+dan2+"=");
		int user = sc.nextInt();
		
		int dan3 = dan1 * dan2;
		
		if(user==dan3) {
			System.out.println("정답");
			count++;
		}
		else {
			System.out.println("오답");
			count2++;
		}
		
		}
		
		sc.close();
		        System.out.println("정답수: "+count+"개 ");
		 		System.out.println("오답수: "+count2+"개");
	}
	
}
