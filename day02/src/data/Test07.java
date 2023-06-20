package data;

public class Test07 {
	public static void main(String[]args) {
		//버스 이용요금 계산기
		
		//입력
		int adultPrice = 1200, adultCount = 2;
		int teenPrice = 1000, teenCount =0;
		int childPrice = 500, childCount = 1;
		
		//계산
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		int childTotal =  childPrice * childCount;
		
		int total = adultTotal + childTotal + teenTotal;
		
		//출력
		System.out.println(total);
				
				
				
	}
}
