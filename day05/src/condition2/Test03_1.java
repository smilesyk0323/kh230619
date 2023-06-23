package condition2;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[]args) {
		//지하철 이용 요금 
		//어르신 65세 이상  무료
		//성인 20세 이상 65세 미만  1250원
		//청소년 14세이상 20세 미만 720원
		//어린이 8세 이상 14세 미만 450원
		//영유아 8세미만  무료
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력:");
		int age = sc.nextInt();		
		sc.close();
		
		//계산 - 이용요금을 계산
		//int price = 1250 or 720 or 450 or 0 ;
		int price; 
		if(age>=65 || age<9) {//어르신 또는 영유아
			price = 0;
		}
		else if(age >= 20) {//성인
			price = 1250;
		}
		else if(age>=14) { //청소년
			price = 720;
		}
		else {//어린이
			price = 450;
		}
		
		int card = 500;
		int result = price + card;

		//조건은 간단하게 조정 및 순서가 중요 
		//영유아가 윗쪽으로 온다면 오류 발생 	
		
		if(age>=65|| age <8) {//어르신 또는 영유아를 합쳐서 
			System.out.println("이용요금은 무료입니다.");
		}
			else if(20 <= age){
				System.out.println("이용요금은 1250원입니다.");
			}
				else if(14 <= age) {
					System.out.println("이용요금은 720원입니다.");
				}
				else {
					System.out.println("이용요금은450원입니다.");	 
					}
		//출력 
		System.out.println("기본요금 : " + price+"원");
		System.out.println("카드보증금 : " + card+"원");
		System.out.println("결제요금 : " + result + "원");
	}
}
