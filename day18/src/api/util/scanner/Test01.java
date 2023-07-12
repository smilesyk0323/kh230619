package api.util.scanner;

import java.util.Scanner;

public class Test01 {
	public static void main(String[]args) {
		//Scanner 클래스 
		//= 문자열 입력 및 분석 클래스 
		//= 키보드입력은 기능 중 일부분일 뿐
		//=파일뿐 아니라 홈페이지도 읽어올 수 있다(웹 크롤링)
		
		String sample= "떳다떳다비행기\n날아라 날아라\n떳다떳다 비행기\n우리비행기";
//		System.out.println(sample);
	
		//[1]단어별로 읽기    .next()				띄어쓰기나 개행 등 공백이 기준
		//							.hasNext()			읽을 수 있는 단어가 있는지 판정 
		//[2]줄별로 읽기 		.nextLine()			개행 문자 기준
//									.hasNextLine() 	읽을 수 있는 줄이 있는지 판정
		
		//(Q).next()와 .nestLine()을 섞어쓰면 어떻게 
		//(A)섞어쓰면 문제가 발생한다 (.next() 다음에 .nextLine()을 쓰면 발생)
				
		Scanner sc = new Scanner(sample);
		
//		while(true) {//false가 나오면 멈춰
//			if(sc.hasNext() == false) break;
//			System.out.println(sc.next());
//		}
		
		while(sc.hasNext()) {// true일때는 계속해라 
			System.out.println(sc.next());
		}
		
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
	
		
		sc.close();
	}

}
