package input;

import java.util.Scanner;

public class Test5_1 {
	public static void main(String[]args) {
		//KH분식점의 메뉴판은 다음과 같습니다. 
		//떡볶이 3000원  튀김  500원   순대 2000원   1  3  1
		//사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결재금액을 출력
		//단 현재 행사중이라서 10% 할인된 가격으로 판매합니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("떡볶이 주문:");
		int ddCount = sc.nextInt();
		System.out.print("튀김 주문:");
		int ttCount = sc.nextInt();
		System.out.print("순대 주문:");
		int ssCount = sc.nextInt();
		
		sc.close();
		
		int dd = 3000;
		int tt = 500;
		int ss = 2000;
		
		int total = (dd * ddCount) + (tt * ttCount) + (ss * ssCount);
		
		int discountPrice = total - (total * 10 / 100);
		
		//System.out.println(discountPrice);
		
		System.out.println("총결제금액은"+ discountPrice+"입니다." );

				

	}
}
