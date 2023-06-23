package condition2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[]args) {
		//BMI 계산기 개조 
		//사용자에게 '신장'과 '체중'을 입력 받아 BMI수치를 계산하고 
		//다음 기준에 따라 비만도 판정까지 수행하도록 구현하세요 
		//체중 / 신장*신장
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm): ");
		int cm = sc.nextInt();
		System.out.print("체중(kg): ");
		int weight = sc.nextInt();
		
		sc.close();
		
		//단위는 첨부터 float도 가능! 
		//float로 시작한다면 18.5는 double 이라 18.5뒤에 f붙이도록 (사실 안붙여도 됨 )
		//float로 작성시 next 뒤에도 Int가 아니라 Float > nextFloat로 입력 잊지 않기 
		
		
		double m = (double)cm / 100; 
		
		double bmi = weight / (m * m);
		
		String result;
		
		if (bmi < 18.5 ) {
			result = "저체중";
		}
		else if(bmi<23) {
			result = "정상";
		}
		else if (bmi<25) {
			result = "과체중";
		}
		else if (bmi < 30) {
			result = "경도비만";
		}
		else {
			result = "중등도비만";
		}
		
		System.out.println("BMI수치는"+bmi+"입니다");
		System.out.print("비만도:"+result);
	}
}
