package api.lang.string;

import java.util.Scanner;

public class Test06 {
	public static void main(String[]args) {
		//쿵쿵따 게임 마들기 
		// 첫번재 제시어 '바나나'로 설정, 사용자에게 단어 입력받아 게임 진행
		//- 입력한 단어는 제시어와 이어져야 합니다
		//- 입력한 단어는 3글자여야 합니다
		//- 위 조건을 만족하지 않을 경우 게임오버가 되며 프로그램 종료
		//- 단어를 정상적으로 입력한 경우 제시어가 입력한 단어로 바뀝니다
		//- 반복적으로 위 작업을 진행합니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("쿵쿵따 게임 시작");
		System.out.print("제시어: ");
		String first = "바나나";
		System.out.println(first);
	
		
//for(int i = 0first.charAt(2)==input.charAt(0)) {
			
			System.out.print("입력: ");
			String input = sc.next();
			System.out.print("제시어: "+ input);

			if(first.charAt(2)==input.charAt(0) && input.length()==3) {
				System.out.println("제시어: "+input);
			}
			else {
				System.out.println("게임오버");
			}
			
//}
		
		
		
		
		
	}
}
