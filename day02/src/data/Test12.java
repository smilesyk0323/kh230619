package data;

public class Test12 {
	public static void main(String[]args) {
		//[과제] 편의점에서 삼각김밥을 '1+1' 행사로 판매하고 있습니다. 한개의 가격은 1400원입니다
		//5개를 샀을 때 다음 항목을 계산하여 출력하세요 
		//*무료 처리되는 개수 *최종 구매 금액
		//참고로 아르바이트생은 절대로 한개 더 가져오라고 하지 않습니다
		int kimbabPrice = 1400;
		int kimbabCount = 5;
		
		int freeKimbabcount = kimbabCount / 2;
		
		int payCount = kimbabCount - freeKimbabcount;
		int totalPrice = payCount * kimbabPrice;
		
		System.out.println(freeKimbabcount);
		System.out.println(totalPrice);
				
		//풀이
		//int price = 1400;
		//int count = 5;
		
		//계산
		//int free = count / 2;
		//System.out.println(free);
		//int pay = count - free;
		//System.out.println(pay);
		
		//int total = price * pay;
		
		//출력
		//System.out.println(free);
		//System.out.println(total);
		
	}
}
