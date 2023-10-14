package com.kh.spring17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
//		param.put("memberId","tester");
//		param.put("memberNickname",54);
//		param.put("memberEmail",54);
//		param.put("memberContact",54);
//		param.put("memberAddr1","제주도");
//		param.put("memberAddr2","100-2");
//		param.put("memberBirthBegin", "2000-01-01");
//		param.put("memberBirthEnd", "2000-12-31");
		param.put("memberJoinBegin", "2023-08-28");
		param.put("memberJoinEnd", "2023-09-28");
		
		List<MemberDto> list = sqlSession.selectList("member.complexSearch",param);
		log.debug("검색 결과 = {}개", list.size());
		for(MemberDto dto : list) {
			log.debug("dto = {}", dto);
		}
	}
}