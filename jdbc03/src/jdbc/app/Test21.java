package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test21 {
	public static void main(String[] args) {
		
		int boardNo = 20;
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(boardNo);
		
		if(dto==null) {
			System.out.println("찾으시는 게시물이 없습니다");
		}
		else {
			System.out.println(dto);
		}
	}
}
