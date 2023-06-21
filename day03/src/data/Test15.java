package data;

public class Test15 {
	public static void main(String[]args) {
		//KH여행사에서는 다음과 같이 프로모션을 진행중입니다. 
		//국내 어디든 한 사람당 1박에 10만원 , 추가로 25%할인까지 챙겨가세요 
		//성인 3명이 7일동안 여행갈 때 예상 경비를 출력하세요
		
		int adult =3;
		int day = 7;
		int pay = 100000;
		int rate = 25;
		
		int totalPay = adult * day * pay;
		int discount = totalPay * rate / 100;
		
		int eventPay = totalPay - discount;
		
		System.out.println(eventPay);
			
		//풀이 :원래 가격과 비교 할 수 있도록 하는 것이 포인트
		
		//입력 : 변수들만 설정 금액과 할인율이 불변이라면 굳이 명시 안해도 됨
		//int people = 3;
		//int days = 7;
		
		//계산
		//int price = peaple * day* 100000;
		
		//int discount = price * 25 / 100;
		//int result = price - discount;
		
		//출력 
		//System.out.println(price);
		//System.out.println(discount);
		
				
				
	}
}
