package api.exception;

import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
		
		//입력
		try {//플랜A
			Scanner sc = new Scanner(System.in);
			
			System.out.print("생년월일 입력(YYYY-MM-DD):");
			String input = sc.next();
			sc.close();
			
//		String [] datePart = input.split("-");
//		
//		int year = Integer.parseInt(datePart[0]);
//		int month = Integer.parseInt(datePart[1]);
//		int day = Integer.parseInt(datePart[2]);
//		
			String part1 = input.substring(0,4);//년도를 자르는 코드 
			String part2 = input.substring(5,7);
			String part3 = input.substring(8,10);
			
			int year = Integer.parseInt(part1);// 문자를 숫자로 변환 
			int month = Integer.parseInt(part2);
			int day = Integer.parseInt(part3);
						
			//출력
			System.out.print("출생년도: "+ year+ "년 ");
			System.out.print("출생월: "+ month + "월 ");
			System.out.print("출생일: "+ day + "일 ");
		}
		
		catch(StringIndexOutOfBoundsException e){//플랜B - 입력길이가 짧을때 
			System.out.println("입력값이 너무 짧습니다");
		}
		catch(NumberFormatException e){//플랜B - 숫자 변환이 안될때
			System.out.println("올바른 숫자가 입력되지 않았습니다");
		}
		
	}
}
