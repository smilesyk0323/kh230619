package com.kh.spring11.rest;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//CORS를 해제하기 위한 설정(Annotation)
//@CrossOrigin//전부다 허용(위험!)- 해제만 하고 지정은 안함
@CrossOrigin(origins = {"http://192.168.130.40:5501"})
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
}





















