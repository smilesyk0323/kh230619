package data;

public class Test09 {
	public static void main(String[]args) {
		
		//예제 한 달에 200만원씩 30년을 모으면 얼마인지 계산하여 출력
		//나의 풀이
		//int money = 2000000;
		//int oneYear = 12 * money;
		//int totalYear = 30;
		//int totalMoney = oneYear * totalYear;
		
		//System.out.println(totalMoney);
		
		//풀이
		//입력
		int money = 2000000;//long money = 100000000L(int단위이상의 수치 가능성)
		int year = 30;
		
		//계산
		int month = year * 12;
		int total = money * month;//long total = money * month
		
		//출력
		System.out.println(total);
		
		
		
		
		
	}
}
