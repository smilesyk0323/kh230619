package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test22 {
	public static void main(String[] args) {
		String memberId = "testuser0";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		if(dto==null) {
			System.out.println("찾으시는 회원 정보가 없습니다");
		}
		else {
			System.out.println(dto);
		}
	}
}
