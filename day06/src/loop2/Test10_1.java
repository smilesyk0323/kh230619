package loop2;

import java.util.Scanner;

public class Test10_1 {
	public static void main(String[]args) {
		//사용자에게 이번주 월요일부터 금요일까지 공부한 시간을 입력 받습니다. 
		// 입력된 정보를 토대로 다음을 계산하여 출력 
		//1.총 공부한 시간 
		//2. 일 평균 공부한 시간 
		
		//입력은 '시간'과 '분'을 따로 받으며,
		//출력도 '시간'과 '분'을 따로 합니다. 
		
		//풀이
	
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		for(int i=0; i < 5; i++) {//공식임! 5의 자리를 변경하면 횟수가 변경
		System.out.print("봉부한 시간");
		int hour = sc.nextInt();
		System.out.print("공부한 분");
		int minute = sc.nextInt();
		int time = hour * 60 + minute;
		total += time;
		
		}
		sc.close();
		
		int hour = total /60;
		int minute = total % 60;
		
		System.out.println("총 공부한 시간은"+hour + "분"+minute+"분 입니다");
		
		int avg = total / 5;
		
		int avgH = avg / 60;
		int avgM = avg %60;
		
		System.out.println("평균 공부한 시간은 약"+avgH+"시간"+avgM+"분 입니다"	);
		
		
		
	}
	
}
