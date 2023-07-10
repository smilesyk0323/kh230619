package api.exception;

public class Test06 {
	public static void main(String[]args) {
		//만나이 계산기 
		//사용자에게 생년월일'YYYY-MM'형식으로 입력받습니다.
		//사용자의 한국나이와 만나이를 구하여 출력 
		//만나이는 태어난 달이거나 해당 달이 지나면 1살 추가하는 방식
		
		//예) 2000년 1월 5일생이면 2001년 1월이  되면 한 살이 늘어납니다
		// 처리 하면서 문제가 되는 상황이 발생하면 상황이 맞는 에러메세지를 출력 
		//예상 가능한 문제상황들은 다음과 같습니다
		//1.입력이 너무 짧은 경우 
		//2.숫자변환이 올바로 되지 않는 경우
		//3.생년월을 미래의 값으로 입력하는 경우 
		//4.월을 1~12로 입력하지 않은 경우 
		//5.연도가 1900 미만인 경우 
		//자바가 감지하는 부분과 못하는 부분을 구분 
		//한 개의 catch 블록으로 모든 예외를 처리할 수 있도록 구현
		
		String birth = "1989-03";
		int thisY = 2023;
		int thisM =  6;
		
		String part1 = birth.substring(0,4);
		String part2 = birth.substring(5,7);
		
		
		
		int birthY = Integer.parseInt(part1);
		int birthM = Integer.parseInt(part2);
		
		int 
		int yearM = (thisY - birthY)*12;
		int totalM = yearM + birthM;
		
		if()
		
		
	
		
		
		
		
	}

}
