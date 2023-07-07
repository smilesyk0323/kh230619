package api.lang.string2;

public class Test05 {
	public static void main(String[]args) {
		//생년월일 검사 프로그램
		//형식 : 연도4자리 + 대시+ 월2자리+ 대시+일2자리로 구성
		//연도 1900년부터 2099년까지만 가능합니다. 
		//월은 01부터 12까지만 가능
		//일은 난이도에 따라 다음과 같이 처리 
		//-하 : 무조건 31까지 
		//-중 : 큰달, 작은달 구분(2월29일)
		//-상 : 윤년을 고려하여 처리 >>정규표현식으론 어려움. 
		 
		//윤년을 알아내기 위한 방법
		//[1] 문자열에서 연도를 잘라내는 방법	(String 클래스)
		//[2] 문자열을 정수로 변환하는 방법		(Integer 클래스)
		String birth = "2000-02-29";

		//[1]	.substring(시작위치, 종료위치)
		String yearStr = birth.substring(0, 4);
		//System.out.println("yearStr = " + yearStr);

		//[2]
		//int year = (int)yearStr;
		int year = Integer.parseInt(yearStr);
		//System.out.println("year = " + year);

		boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

		String regex;
		if(leapYear) {
			regex = "^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$";
		}
		else {
			regex = "^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-8])))$";
		}

		if(birth.matches(regex)) {
			System.out.println("올바른 날짜");
		}
		else {
			System.out.println("잘못된 날짜");
		}
	}


		
	}


