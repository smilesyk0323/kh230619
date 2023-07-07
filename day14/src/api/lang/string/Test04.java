package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[]args) {
		//사용할 닉네임 받도록 구현 , 다음과 같은 상황일 경우 오류 메세지 출력 
		//- 닉네임이 2글자 이상 10글자 이하가 아닌경우 
		//- 닉네임에 '운영자'라는 단어가 포함된 경우 
		//모든 검사를 통과 했다면 '닉네임 설정이 완료 되었습니다'라는 메세지를 출력 

		Scanner sc = new Scanner(System.in);
		//닉네임 설정 문제 
		
		//boolean 사용 비추천 성능저하.. 
		String nickname = sc.next();
		
		if(nickname.length()<2 || nickname.length()>10) {//거절조건1
			System.out.println("2글자 이상 10글자 이하로만 작성하세요");
		}
		else if(nickname.contains("운영자")) {//거절조건2
			System.out.println("운영자라는 단어는 포함할 수 없습니다"	);
		}
		else {
			System.out.println("닉네임 설정이 완료되었습니다");
		}
		
	}
}