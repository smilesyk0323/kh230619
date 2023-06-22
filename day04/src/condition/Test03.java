package condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
		//KH국밥집에서는 65세 이상 어르신만 30% 할인된 가격에 국밥을 판매합니다.
		//국밥 한 그릇에 7500원일 때, 출생년도 4자리와 그릇 수를 입력받아 상황에 맞는 결제 금액을 계산하여 출력하세요
		
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("출생년도를 입력하세요");
		//int birth = sc.nextInt();
		///System.out.println("주문할 국밥 수량:");
		//int soupCount = sc.nextInt();
		
		//sc.close();
		
		//int year = 2023;
		//int soupPrice = 7500;
		//boolean age = (year - birth +1) >= 65;
		
		//int totalPrice = soupCount * soupPrice; 
		
		//boolean gland = (year - birth +1) >=65;
		
		//풀이
		//입력

				System.out.print("출생년도 4자리 : ");
				int birth = sc.nextInt();

				System.out.print("국밥 개수 : ");
				int count = sc.nextInt();

				sc.close();

				int year = 2023;
				int price = 7500;

				//계산
				int age = year - birth + 1;

				int total = price * count;
				//int discount = 0 또는 30%금액;
				int discount;
				if(age >= 65) {
					discount = total * 30 / 100;
				}
				else {
					discount = 0;
				}

				int result = total - discount;

				//출력
				System.out.println("나이 : " + age + "세");
				System.out.println("금액 : " + result + "원");

		
		
		
		
		
		
		
	}
}
