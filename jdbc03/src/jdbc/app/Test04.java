package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04 {
		public static void main(String[] args) {
			
			MemberDto dto = new MemberDto();
			dto.setMemberId("testuser0");
			dto.setMemberPw("testUser3!");
			dto.setMemberNickname("테스트유저3");
			dto.setMemberBirth("2020-03-13");
			dto.setMemberEmail("");
			dto.setMemberContact("01045674567");
			
			MemberDao dao = new MemberDao();
			dao.insert(dto);
			
			System.out.println("등록완료!");
			
		}
}
