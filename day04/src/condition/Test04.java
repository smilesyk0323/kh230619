package condition;

import java.util.Scanner;

public class Test04 {
	public static void main(String[]args) {
		//KH여행사에서 두 번째 프로모션을 다음과 같이 진행하려고 합니다
		//-여름 매출이 저조하여 여름에 여행갈 경우 비용에서 25%를 할인합니다
		//- 여름이 아닌 다른 계절은 할인 행사를 진행하지 않습니다
		//이전과 동일하게 '국내 어디든 1인 1박에 10만원'이라는 슬로건을 유지할 사용자에게
		//필요한 정보를 입력받아 예상 경비를 출력하도록 구현하세요 
		
		int dayPrice = 100000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("여행을 몇월에떠나시나요? ");
		int month = sc.nextInt();
		System.out.print("여행인원:");
		int people = sc.nextInt();
		System.out.print("여행일수:");
		int day = sc.nextInt();
		
		
		int totalPrice = day * people * dayPrice;
		int discount;
		
		if(month==6|| month ==7 || month ==8) {
			discount = totalPrice * 25 / 100;
		}
		else {
			discount = 0;
		}
			int resert = totalPrice - discount;
			
			System.out.println("인원: " +people + "명");
			System.out.println("여행일수: " + day + "일");
			System.out.println("숙박비용: " + resert + "원");
	}
}
