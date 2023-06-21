package data2;

public class Test02 {
	public static void main(String[]args) {
		//키가 180cm, 체중이80kg인 사람이 있을 때 이 사람의 BMI지수를 구하여 출력 
		//double tall = 180;
		//double weignt = 80;
		
		//double height = tall / 100;
		
		//double bmi = weignt / (height * height);
				
		//System.out.println(bmi);
		
		//BMI풀이 
		//입력
		int cm =180;
		int kg = 80;
		
		//계산
		//int m = cm / 100;
		//float m = cm / 100f;
		//double m = cm / 100d;
		double m = (double)cm / 100;
		
		double bmi = kg / (m * m);
		//double bmi = kg / m / m;
		
		//출력
		System.out.println(bmi);
				
	}
}
