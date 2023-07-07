package api.lang.string2;

public class Test05 {
	public static void mian(String[]args) {
		//생년월일 검사 프로그램
		//형식 : 연도4자리 + 대시+ 월2자리+ 대시+일2자리로 구성
		//연도 1900년부터 2099년까지만 가능합니다. 
		//월은 01부터 12까지만 가능
		//일은 난이도에 따라 다음과 같이 처리 
		//-하 : 무조건 31까지 
		//-중 : 큰달, 작은달 구분(2월29일)
		//-상 : 윤년을 고려하여 처리 
		 
		String birth = "2999-11-25";
		
		String regex = "^([1][9][0-9][0-9]|[2][0][0-9][0-9])-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
		
		
		if(birth.matches(regex)) {
			System.out.println("유효한 생년월일입니다");
		}
		else {
			System.out.println("다시입력하세요");
		}
		
		
	}

}
