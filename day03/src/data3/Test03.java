package data3;

public class Test03 {
	public static void main(String[]args) {
		//어떤 숫자(ex: 17)가 주어졌을 때
		//이 숫자가 짝수인지 판정하여 출력하도록 프로그램 구현 
		//int number = 17; 하나도.. 모르겠음.. 
		
		
		//짝수 판정 풀이
		
		//입력
		int number = 17;
		
		//계산
		int mod = number % 2;
		//boolean zero = mod가 0가 같습니까?
		boolean even = mod ==0;
		
		//boolean even = number % 2 == 0;  >효율적인 계산식 
		
		//출력
		System.out.println(even);
		
	
				
	}
}
