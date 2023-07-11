package api.exception;

import java.util.Scanner;

public class Test06_1 {
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
		
		try {
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년월 입력(예시:YYYY-MM):");
		String input = sc.next();
		
		
		int currentYear = 2023;
		int currentMonth =  7;
		sc.close();
		
		//if(! input.matches("검사식") == false){//형식에 맞지 않으면 앞에 '!' 하거나 뒤에 '== false' 넣거나 
		//     throw new Exception();    }
		
		
		//계산
		String[] part = input.split("-");//- 구분자(delimiter)로 하여 분해 
		
		int year = Integer.parseInt(part[0]);
		int month = Integer.parseInt(part[1]);
		if(year > currentYear || year ==currentYear && month > currentMonth) {//미래의 연/월이라면
			throw new Exception("미래의 시간은 입력할 수 없습니다");
		}
		if(year < 1900) {
			throw new Exception("1900년 미만은 입력할 수 없습니다");
		}
		if(month < 1 || month >12) {
			throw new Exception("출생월은 1~12만 입력가능합니다");
		}
		
		//한국나이 
		int KoreanAge = currentYear - year +1;

		//만나이 계산 - 12개월 마다 1살 
		//= 개월수 / 12
		int totalMonth = (currentYear - year) * 12 +(currentMonth- month );
		int globalAge = totalMonth / 12;
		
			
		//출력
		System.out.println("한국나이: " +KoreanAge +"세, 만"+ globalAge +"세");
		
		
		
		}
		catch(Exception e) {		
			
				System.err.println("오류발생");
				}
	}
}