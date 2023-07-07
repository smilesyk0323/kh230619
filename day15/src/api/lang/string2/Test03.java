package api.lang.string2;

import java.util.regex.Pattern;

public class Test03 {
		public static void main(String[]args) {
			//정규 표현식(REGular EXpression)
			
			//휴대전화번호 판별 프로그램 
			//-대시는 작성할 수 없습니다
			//010,011,016,017,018,019로 시작 
			//가운데는 3-4자리의 숫자
			//마지막은 4자리 숫자
			
			String number = "01012123434";
			
			String regex = "^01[016789]-?[1-9][0-9]{2,3}-?[0-9]{4}$";//가운데 맨앞자리는  0이 나올수없음
//			boolean isValid = Pattern.matches(regex	,number);//검사식, 검사할값
			boolean isValid = number.matches(regex);
			
			if(isValid) {
				System.out.println("유효한 전화번호입니다");
			}
			else {
				System.out.println("잘못된 전화번호입니다");
			}
			
//			System.out.println("isValid= "+ isValid);
			
			

		}
}
