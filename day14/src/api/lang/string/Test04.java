package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[]args) {
		//사용할 닉네임 받도록 구현 , 다음과 같은 상황일 경우 오류 메세지 출력 
		//- 닉네임이 2글자 이상 10글자 이하가 아닌경우 
		//- 닉네임에 '운영자'라는 단어가 포함된 경우 
		//모든 검사를 통과 했다면 '닉네임 설정이 완료 되었습니다'라는 메세지를 출력 

		Scanner sc = new Scanner(System.in);

		System.out.print("사용할 닉네임을 입력하세요: ");
		String user = sc.nextLine();
		sc.close();

		int userLength = user.length();

		if( userLength<=2 && userLength>=10) {
			System.out.println("닉네임의 글자수가 잘못 되었습니다");
		}
		else if(user.contains("운영자")){
			System.out.println("닉네임에 '운영자'를 포함할 수 없습니다");
		}
		else {
			System.out.println("닉네임 설정이 완료 되었습니다");
		}
	}
}