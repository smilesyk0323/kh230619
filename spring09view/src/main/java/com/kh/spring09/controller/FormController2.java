package com.kh.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController//데이터를 반환
@Controller//화면을 반환
@RequestMapping("/form2")
public class FormController2 {
	@RequestMapping("/test01")
	public String test01() {
		return "/WEB-INF/views/form2/test01.jsp";
	}
}
