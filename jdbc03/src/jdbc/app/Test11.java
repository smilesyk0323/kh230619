package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {
	public static void main(String[] args) {
		//회원정보 수정 
		
		//비밀번호 DB검사 및 비밀번호 일치 검사 등을 추가할 수 있다 
		MemberDto dto = new MemberDto();
		dto.setMemberId("testuser0");
		dto.setMemberNickname("테스트유저4");
		dto.setMemberContact("01055556666");
		dto.setMemberEmail(" ");
		dto.setMemberBirth("2021-03-23");
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if(result) {
			System.out.println("개인정보 변경완료");
		}
		else {
			System.out.println("고객정보불일치");
		}
	
	}
}
