package data3;

public class Test07 {
	public static void main(String[]args) {
		//윤년 계산기 만들기 
		//윤년이란 실제 1년과 달력상의 1년의 차이 때문에 생기는 날짜를 메꾸기 위한 해입니다
		//실제 = 365.24..일,달력=365일
		//윤년의 규칙은 다음과 같습니다. 
		//-윤년에는 2월이 29일까지 있습니다.(366일)
		//-4의 배수인 해는 윤년으로 간주합니다
		//-100의 배수인 해는 4의 배수일지라도 윤년이 아닌 것으로 간주합니다
		//-400의 배수인 해는 100의 배수일지라도 윤년으로 간주합니다
		//이 기준을 토대로 특정 연도가 윤년인지 아닌지 판정해서 출력 
		
		//int year = 2000;
		
		//int 윤년 = 4의 배수 && 4의배수 - (100의 배수-400의 배수) 
		
		//boolean year4 = year % 400 ==0; 
		//boolean year1 = year % 100 == 0;
		//boolean yYear = year % 4 == 0 &&  (year1 == year4); 
		
		//System.out.println(yYear);
				
		
		//윤년 계산 프로그램 풀이
		
		//입력
		int year = 2000;
				
		//계산
		//[1] 4의 배수면 윤년                       include
		//[2] 100의 배수면 윤년이 아니다       exclude
		//[3] 400의 배수면 윤년이다             include
		
		//boolean leepYear = 3 || 2 && 1;  //조건3이 가장 앞으로 온 이유!! 중요!
		
		boolean is4 = year % 4 == 0;
		//boolean isNot100 = year % 100 != 0;
		boolean isNot100 = year % 100 != 0;
		boolean is400 = year % 400 == 0;
		boolean leapYear = is400 || is4 && isNot100;
					
				
		//출력
		System.out.println(leapYear);
		
		
				
	}
}
