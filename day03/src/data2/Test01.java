package data2;

public class Test01 {
	public static void main(String[]args) {
		//실수가 필요한 상황
		//(Q) 국어 점수가 75점, 영어점수가 80점일 때 평균?
		
		int korean = 75;
		int english = 80;
		
		//int average = (korean + english) / 2;
		double average = (korean + english) / 2.0;
		
		System.out.println(average);
		
		//실수는 2가지 종류가 있다
		// - float, double
		// - 표시 가능한 숫자 자리수 차이가 존재 
		// - double을 기본값으로 인식하며 *float는 표시*해야함 
		// - 자리수 제한으로 부정확하다
		
		float a = 3.14f;
		double b = 3.14;
		System.out.println(a);
		System.out.println(b);
		
		//(중요) 실수가 한개라도 있는 계산은 결과가 실수 
		System.out.println(10/3f);//소수점이 없어도 f,d표시한다면 답은 실수
	}
}
