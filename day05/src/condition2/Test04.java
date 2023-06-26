package condition2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[]args) {
		//여행사 프로모션3
		//무조건 1인당 1박 10만원 유지 
		
		//계절별로 다른 할인율 
		
		//필요 정보 : 인원 + 일수 + 여행시기(월)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행인원:"); 
		int people = sc.nextInt();
		System.out.print("여행일수:");
		int day = sc.nextInt();
		System.out.print("여행일자(월):");
		int month = sc.nextInt();
		
		sc.close();
		
		int dayPrice = 100000;
		int discount;
		
		//계절별 다른 할인율 
		//봄(3,4,5)  month / 3 = 1
		//여름 (6,7,8) month / 3 = 2
		//가을 (9,1011) month / 3 = 3
		// 겨울(12,1,2) month / 그외 나머지
		if( month / 3 == 1 ) {
			discount = dayPrice * 20 /100;
		}
		else if(month / 3 ==2) {
			discount = dayPrice *10 /100;
		}
		else if(month / 3 ==3) {
			discount = dayPrice * 30 /100;
		}
		else {
			discount = dayPrice * 5 /100;
		}
	
		int totalPay = people * day * dayPrice;
		int discountPay = totalPay - discount;
		
		System.out.println("예상금액: "+ totalPay +"원");
		System.out.println("할인금액 :"+ discount +"원");
		System.out.println("최종 경비: "+ discountPay + "원");
				
	}
}
