package condition;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[]args) {
		//과속단속 카메라 프로그램 
		//KH전자에서 만든 과속단속 카메라는 다음 규칙에 따라서 벌금을 계산합니다. 
		//50km를 초과하는 속도로 달리는 자동자를 단속
		//기본 벌금은 30000원으로 설정 
		//벌금은 제한속도보다 10km 이상 빨라질 때마다 10000원씩 증가 
		//자동차 속도를 입력값으로 설정한 뒤 예상되는 벌금을 출력(과속이 아니면 벌금은 없습니다)
		
		int finePrice = 30000;//기본 벌금 
		//(1)벌금 부과 대상인지 아닌지
		//(2)50km 초과 속도 벌금 부과 
		//(3)10km이상 빨라질 때마다 10000원씩 증가 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자동차 속도값: ");
		int speed = sc.nextInt(); 
		boolean finePay = speed > 50;//과속 기준
		sc.close();
		
	    //60(50+10),70(50+20),80(50+30)...km  4(3+1)만원,5(3+2)만원,6(3+3)만원
	    int extraSpeed =speed -50  ; // 50이상의 과속 속도 
	    int extraPrice = (extraSpeed / 10) * 10000;// 10km씩 추가되는 벌금
		
		int totalPay = finePrice + extraPrice;
		
		if(finePay) {
			System.out.println("벌금은 "+ totalPay +"원입니다");//벌금 부과시 
		}
		else {
			System.out.println("벌금은 없습니다");//과속이 아닐시 ,
		}	
	}
}
