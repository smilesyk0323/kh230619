package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.mapper.BoardMapper;
import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		
		String sql = "select * from board order by board_no desc";
		
		BoardMapper mapper = new BoardMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<BoardDto>list = jdbcTemplate.query(sql, mapper);
		
//		if(list.size() == 0) {//값이 비어 있을경우 
		if(list.isEmpty()) {	
			System.out.println("게시글이 존재하지 않습니다");
		}
		
		for(BoardDto dto :list) {
//			System.out.println(dto);//dto.toString()
			System.out.println(dto.getBoardTitle());
		}
				
	}
}
