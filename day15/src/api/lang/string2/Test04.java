package api.lang.string2;

public class Test04 {
	public static void main(String[]args) {
		//네이버 회원가입 양식을 토대로 아이디 검사를 구현 
		// 5~20자의 영문소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다
		//반드시 영문 소문자로 시작해야 합니다. 
		String id = "dkjs5le23k_-";
		
		String regex = "^[a-z][a-z0-9\\_-]{4,19}$";
		
		if(id.matches(regex)) {
			System.out.println("유효한 아이디입니다");
		}
		else {
			System.out.println("잘못된 아이디입니다");
		}
	}

}
