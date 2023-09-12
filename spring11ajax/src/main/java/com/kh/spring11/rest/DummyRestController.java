package com.kh.spring11.rest;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dao.PocketmonDao;
import com.kh.spring11.dto.MemberDto;
import com.kh.spring11.dto.PocketmonDto;

//CORS를 해제하기 위한 설정(Annotation)
@CrossOrigin//전부다 허용(위험!)- 해제만 하고 지정은 안함
//@CrossOrigin(origins = {"http://192.168.130.40:5501"})
@RestController//@Controller + @ResponseBody
public class DummyRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello spring ajax";
	}
	
	//Rest Controller에서는 내가 전해줄 데이터가 반환형이 된다
	//-자동으로 Spring에서 JSON형태로 변환하여 반환
	//- 변환을 담당하는 라이브러리는 jackson-databind
	@RequestMapping("/lotto")
	public Set<Integer> lotto() {//내가 주고 싶은 데이터 형태를 옆에 적어야 함
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		while(set.size()<6) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		return set;
	}
	
	@Autowired
	private MemberDao memberDao;
	@PostMapping("/idCheck")
	public String idCheck(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto != null) {//아이디가 있으면
			return "Y";
		}
		else {//아이디가 없으면 
			return "N";
		}
	}
	
	@PostMapping("/nickCheck")
	public String nickCheck(@RequestParam String memberNickname) {
		MemberDto memberDto = memberDao.selectOneNick(memberNickname);
		if(memberDto != null) {
			return "Y";
		}
		else { 
			return "N";
		}
	}
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	//프론트엔드에 포켓몬 목록을 반환하는 매핑
	@RequestMapping("/pocketmon")
	public List<PocketmonDto> pocketmon() {
		return pocketmonDao.selectList();
	}
	
}




















