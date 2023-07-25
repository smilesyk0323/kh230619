package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test16 {
	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		List<BoardDto>list = dao.selectList();
		

		for(BoardDto dto : list) {
			System.out.println("["+dto.getBoardNo()+"]");
			System.out.println(dto.getBoardTitle());
		}
	}
}
