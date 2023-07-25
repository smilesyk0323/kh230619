package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {
	public static void main(String[] args) {
		//게시글 수정 프로그램 
		
		//데이터
		BoardDto dto = new BoardDto();
		dto.setBoardNo(5);
		dto.setBoardTitle("바뀐제목");
		dto.setBoardContent("바뀐내용");
		//처리
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("게시글 수정 완료");
		}
		else {
			System.out.println("게시글을 찾을 수 없습니다");
		}
	}
}
