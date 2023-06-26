package loop2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[]args) {
		//사용자에게 숫자를 10개를 입력 받음 
		//1.홀수의 개수 
		//2.짝수의 개수 
		//3.전체 합계
		//4.전체 평균 
		
		Scanner sc = new Scanner(System.in);

		int one =0;
		int two =0;
		int total = 0;
			
		for(int i =1; i <=10; i++) {
			int number = sc.nextInt();
			
		     if(number % 2!=0) {
		    	// System.out.println("홀수");
		    	 one++;
		     }
		     else {
		    	 //System.out.println("짝수");
		    	 two++;
		     }
		    total  += number; 
		  
		}
		   sc.close();
		
		System.out.println("홀수개수: "+ one+"개"  );
		System.out.println("짝수 개수: "+ two+"개" );
		System.out.println("합계 : "+total );
		System.out.println("평균: "+(double)total/10 );
	}
	
}
