package api.exception;

import java.util.Scanner;

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
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년월 입력(예시:YYYY-MM)");
		String birth = sc.next();

		int thisY = 2023;
		int thisM =  6;
		sc.close();

		String part1 = birth.substring(0,4);
		String part2 = birth.substring(5,7);

		int birthY = Integer.parseInt(part1);
		int birthM = Integer.parseInt(part2);

		if(birthY<1900) {
			throw new Exception("출생년도는1900년부터 입력가능합니다");
		}
		if(birthM<1||birthM>12) {
			throw new Exception("출생월은 1~12만 입력가능합니다");
		}

		int ageM = (thisY - birthY)*12; //올해 만나이를개월수 

		int age = (ageM+birthM)/12;

		if((thisM-birthM)<1) {//올해 월 - 출생 월 < 1 =생일 달(포함) 지난 후 나이 
			System.out.println("한국나이: " + ( age+1)+"세, 만"+  age +"세");
		}
		else {//생일달 전 나이 
			System.out.println("한국나이: "+  age + "세, 만"+  (age -1) +"세");
		}

		}
		catch(Exception e) {			
				System.err.println("오류발생");
				}
	}
}