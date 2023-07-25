package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {
	public static void main(String[] args) {
		
		BoardDto dto = new BoardDto();
		dto.setBoardNo(2);
		dto.setBoardTitle("testtitle");
		dto.setBoardContent("asdfkjlkjl");
		
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("변경완료");
		}
		else {
			System.out.println("존재하지 않는 몬스터 번호");
		}
	}
}
