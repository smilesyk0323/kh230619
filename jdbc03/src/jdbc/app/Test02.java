package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {
		public static void main(String[] args) {
			//게시글 작성 프로그램 
			
			//데이터 
//			int boardNo = 32;
//			String boardTitle = "테스트제목2";
//			String boardContent = "테스트내용2";
//			String boardWriter = "testWriter123";
			BoardDto dto = new BoardDto();
			dto.setBoardNo(23);
			dto.setBoardTitle("테스트제목1");
			dto.setBoardContent("테스트내용1");
			dto.setBoardWriter("testWriter456");
								
			//처리
			BoardDao dao = new BoardDao();
//			dao.insert(boardNo, boardTitle, boardContent, boardWriter);
			dao.insert(dto);
			
			System.out.println("등록완료!");
		}
	
	
}
