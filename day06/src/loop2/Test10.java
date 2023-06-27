package loop2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[]args) {
		//사용자에게 이번주 월요일부터 금요일까지 공부한 시간을 입력 받습니다. 
		// 입력된 정보를 토대로 다음을 계산하여 출력 
		//1.총 공부한 시간 
		//2. 일 평균 공부한 시간 
		
		//입력은 '시간'과 '분'을 따로 받으며,
		//출력도 '시간'과 '분'을 따로 합니다. 
		
		
		Scanner sc = new Scanner(System.in);
		
		int totalH = 0;
		int totalM = 0;
		
		for(int i =0; i <5; i++) {
			System.out.print("시간: " );
			int hour = sc.nextInt();
			System.out.print("분: ");
			int min = sc.nextInt();
			totalH += hour;
			totalM += min;//불필요한 코드 
		}
			int totalTime = (totalH * 60) + totalM;
			int studyHour = totalTime / 60;
			int studyMin = totalTime % 60;
			int avg = totalTime / 5;
			int avgHour = avg / 60;
			int avgMin = avg % 60;
			
			sc.close();
			
		
		
		
		System.out.println("총 공부한 시간은 "+ studyHour +"시간" + studyMin +"분");
		System.out.println("일 평균 약"+ avgHour +"시간" +avgMin+ "분");
		
	}
	
}
