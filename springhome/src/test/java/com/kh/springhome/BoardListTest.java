package com.kh.springhome;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BoardListTest {
		
		@Autowired
		private BoardDao boardDao;
		
		@Autowired
		private BoardDto boardDto;
		
		@Test
		public void test() {
			List<BoardDto>list = boardDao.selectList(boardDto);
			
			// 단정문(Assertion)
			//-Spring Test에서 사용할 수 있는 테스트 판정 구문 
			//-assert로 시작 
			assertNotEquals(0, list.size());
		}
			//for(BoardDto boardDto : list){
			//	log.debug("boardDto = {}",boardDto);
		//}
}
