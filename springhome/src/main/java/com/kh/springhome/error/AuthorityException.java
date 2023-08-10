package com.kh.springhome.error;

import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.NoArgsConstructor;

/*
		권한과 관련된 문제가 발생한 경우 사용할 예외 클래스
		- 로그인을 하지 않은 경우 
		- 로그인을 했으나 권한이 부족한 경우 
		- 자기 자신의 컨텐츠에만 접근해야 하는 경우(남의 것을 접근한 경우)
*/
@NoArgsConstructor
public class AuthorityException extends RuntimeException{
			public AuthorityException(String message) {
				super(message);
			}		
			
			/*
			 		내가 지정한 예외들을 처리하도록 추가 핸들러(처리기) 설정
			 */
			@ExceptionHandler(NoTargetException.class)
				public String noTarget(NoTargetException e) {
					//e.printStackTrace();
					return "/WEB-INF/views/error/noTarget.jsp";
			}
			@ExceptionHandler(AuthorityException.class)
				public String authority(AuthorityException e) {
				e.printStackTrace();
				return "/WEB-INF/views/error/authority.jsp";
			}
}




