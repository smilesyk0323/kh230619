package com.kh.spring17.configuration;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

//목표 : empty string을 컨트롤러가 null로 해석하도록 설정
@ControllerAdvice
public class EmptyStringControllerAdvice {
	
	@InitBinder
	public void customBinding(WebDataBinder binder) {//특정 조건을 요청
													//(자료형, 처리도구)
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));//empty를 null로 인식
		
	}
}
