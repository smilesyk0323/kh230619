package api.lang.string2;

public class Test07 {
	public static void main(String[]args) {
		
		//회원가입 + 정규표현식 검사 
		String memberId = "어쩌구";
		String memberPw = "저쩌구";
		String memberName = "얼씨구";
		
		Member member = new Member(memberId, memberPw, memberName);
		
		member.show();
				
	}	
}
