package data;

public class Test13 {
	public static void main(String[]args) {
		//[과제]KH커피숍에서는 커피 5잔당 1잔씩 무료로 제공하는 이벤트를 하고 있습니다
		//우리반 학생27명과 강사까지 마실 커피를 주문했을 때 다음 항목을 계산하여 출력하세요
		//*무료로 계산되는 커피 잔 수 * 최종 결제 금액 
		//커피는 한 잔에 2500원 입니다. 
		int student = 27;
		int teacher = 1;
		int coffee = 2500;
		int ourClass = student + teacher;
		
		int freeCount = ourClass / 5;
	
		int payCount = ourClass - freeCount;
		int payMoney = payCount * coffee;
		
		System.out.println(freeCount);
		System.out.println(payMoney);
	
				
		//풀이
		//인원변수가 2개일 필욘 없다! 학생 선생 구분 없이 커피숍의 입장에서 주문잔수만 집중!
		//늘 테스트는 필수!! > 경계값 테스트
		//4+1 이거나 5+1로 계산하면 됨
		//5+1 풀이 
		
		//입력
		//int count = 28;
		//int price = 2500;
		
		//난이도를 높이면 int event = 5;  int free = count / ( event + 1 );
		
		//계산
		//int free = count/6
		//int pay = count - free;
		
		//int total = price * pay;
		
		//출력
		//System.out.println(free);
		//System.out.println(total);		
				
				
				
	}
}
