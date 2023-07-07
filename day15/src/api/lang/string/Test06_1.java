package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[]args) {
		//쿵쿵따 게임 마들기 
		// 첫번재 제시어 '바나나'로 설정, 사용자에게 단어 입력받아 게임 진행
		//- 입력한 단어는 제시어와 이어져야 합니다
		//- 입력한 단어는 3글자여야 합니다
		//- 위 조건을 만족하지 않을 경우 게임오버가 되며 프로그램 종료
		//- 단어를 정상적으로 입력한 경우 제시어가 입력한 단어로 바뀝니다
		//- 반복적으로 위 작업을 진행합니다
		
		String[] list = new String[] {
				"강아지", "가로수", "각설탕", "나팔꽃", "눈송이", "도너츠"
			};

			Random r = new Random();
			int index = r.nextInt(list.length);

			String given = list[index];

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("쿵쿵따 게임 시작");
		System.out.print("제시어: ");
		String first = "바나나";
	
		

			while(true) {			
			System.out.println(first);
			System.out.print("입력: ");
			String input = sc.next();
			System.out.print("제시어: "+ input);			
			//판정
			//[1] 3글자인지 판정
			//[2] 이어지는지 판정

//			if(input.length()!=3) {System.out.println("게임오버");	}  //블랙리스트 조건 
//			else if(first.charAt(2) != first.charAt(0)) {     //char 원시형은 equres 사용 안됨
//				System.out.println("게임오버");	}
//			else {	System.out.println("합격!");}
			
			if(input.length()==3 && first.charAt(2) == first.charAt(0) ) {
			System.out.println("합격!");
			System.out.println();
			first = input;//제시어 교체 
			}
		else {
			System.out.println("게임오버!");
			break;
		}
			}

		
		
		
			sc.close();
		
	}
}
