package condition2;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[]args) {
		//여행사 프로모션3
		//무조건 1인당 1박 10만원 유지 
		
		//계절별로 다른 할인율 
		
		//필요 정보 : 인원 + 일수 + 여행시기(월)
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행인원:");
		int people = sc.nextInt();
		System.out.print("여행기간(일):");
		int days = sc.nextInt();
		System.out.print("여행예정 월:");
		int month = sc.nextInt();
		
		sc.close();
		
		//계산
		int total = 100000 * people * days;
		//int rate = 20 or 10 or 30 or 5;
		
		int rate;

		if( month / 3 == 1 ) {
			rate = 20;
		}
		else if(month / 3 ==2) {
			rate = 10;
		}
		else if(month / 3 ==3) {
			rate = 30;
		}
		else {
			rate = 5;
		}
	
		int discount = total * rate / 100; //할인 금액
		int result = total - discount; //최종경비 
		
		System.out.println("예상금액: "+ total +"원");
		System.out.println("할인율:  "+ rate +"%");
		System.out.println("할인금액 :"+ discount +"원");
		System.out.println("최종 경비: "+ result + "원");
				
	}
}
