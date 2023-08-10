package com.kh.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 		컨트롤러를 간섭하여 예외 상황을 다르게 처리하도록 하는 객체
 		- 등록시 @ControllerAdvice라고 등록
 		-@RestController를 간섭할 경우는 @RestControllerAdvice를 사용
 		-적용 대상을 옵션으로 지정
 */
//@ControllerAdvice(basePackages = {"com.kh.springhome.controller"})//배열일땐 중괄호사용
@ControllerAdvice(annotations = {Controller.class})//.class 스프링걸로 해야함<- try에 해당
public class ExceptionControllerAdvice {
		/*
		 		예외는 @ExceptionHandler메소드로 처리 가능
		 		- 처리할 예외의 종류 지정 가능
		 		-메소드의 형태는 컨트롤러와 같음
		 		-try 구문의 catch블록과 같은 역할을 수행 
		 */
	@ExceptionHandler(Exception.class)
		public String error() {
			return "/WEB-INF/views/error/500.jsp";//jsp주소 작성 
	}
}
