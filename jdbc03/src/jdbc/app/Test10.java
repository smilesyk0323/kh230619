package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {
	public static void main(String[] args) {
		//비밀번호 변경 프로그램 
		// - 기존비밀번호 비교는 불가하나 비밀번호 한번더 입력은 가능
		
		//데이터 준비 
		String memberId = "testuer0";
		String memberPw = "testUser4!";
		String memberPwRe = "testUser4!";
		
		//검사
		if(memberPw.equals(memberPwRe)) {//비밀번호와 확인이 일치한다면
			MemberDto dto = new MemberDto();
			dto.setMemberId(memberId);
			dto.setMemberPw(memberPwRe);
			
			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberPassword(dto);
			
			if(result) {
				System.out.println("비밀번호가 변경되었습니다");
			}
			else {
				System.out.println("존재하지 않는 아이디입니다");
			}
		}
		else {
			System.out.println("비밀번호가 확인과 일치하지 않습니다");
		}
		
		
//		MemberDto dto = new MemberDto();
//		dto.setMemberId("testuser0");
//		dto.setMemberPw("testUser5!");
//		
//		MemberDao dao = new MemberDao();
//		boolean result = dao.updateMemberPassword(dto);
//		
//		if(result) {
//			System.out.println("비밀번호 변경완료");
//		}
//		else {
//			System.out.println("고객정보 불일치");
//		}
	}
}
