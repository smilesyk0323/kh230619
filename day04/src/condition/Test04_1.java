package condition;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[]args) {
		//KH여행사에서 두 번째 프로모션을 다음과 같이 진행하려고 합니다
		//-여름 매출이 저조하여 여름에 여행갈 경우 비용에서 25%를 할인합니다
		//- 여름이 아닌 다른 계절은 할인 행사를 진행하지 않습니다
		//이전과 동일하게 '국내 어디든 1인 1박에 10만원'이라는 슬로건을 유지할 사용자에게
		//필요한 정보를 입력받아 예상 경비를 출력하도록 구현하세요 
		
		//여행사 프로모션2
		
		//입력
				Scanner sc = new Scanner(System.in);
				
				System.out.print("인원수 : ");
				int people = sc.nextInt();
				
				System.out.print("기간(일) : ");
				int days = sc.nextInt();
				
				System.out.print("예정 월 : ");
				int month = sc.nextInt();
				
				sc.close();
				
				//계산
				int price = 100000 * people * days;
				boolean summer = month == 6 || month == 7 || month == 8;
				//int discount = 0 또는 25%금액;
				int discount;
				if(summer) {
					discount = price * 25 / 100;
				}
				else {
					discount = 0;
				}
				
				int result = price - discount;
				
				
				//출력
				System.out.println("정상가 = " + price + "원");
				System.out.println("할인금액 = " + discount +"원");
				System.out.println("판매가 = " + result + "원");
		
	}
}
