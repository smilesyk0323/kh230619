package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test19 {
	public static void main(String[] args) {
		int page = 1;
		
		MemberDao dao = new MemberDao();
		List<MemberDto>list = dao.selectListByPage(page);
		
		for(MemberDto dto : list) {
			System.out.println("["+dto.getMemberLevel()+"]");
			System.out.println(dto.getMemberId());
		}
	}
}
