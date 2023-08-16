package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.error.AuthorityException;

//게시글 소유자인 경우에만 통과시키는 인터셉터
//필요한 정보: 게시글 번호(파라미터), 사용자ID(세션)
@Component//@Autowired(주세요)를 사용시 항상 @Component(등록)확인!! 
public class BoardOwnerInterceptor implements HandlerInterceptor{
	
		@Autowired
		 private BoardDao boardDao;

		//필요한 메소드 재정의 
		@Override
		public boolean preHandle(HttpServletRequest request, //파라미터,세션
												HttpServletResponse response,//이 사용자의 다음을 알려주는
												Object handler)
				throws Exception {
				//현재 사용자의 아이디를 읽는 코드 
				HttpSession session = request.getSession();	
				String memberId = (String) session.getAttribute("name");
													
					if (memberId != null) {
						//글번호를 읽는 코드 
						//-request.getParameter("이름")으로 파라미터를 읽는다
						//-통신이기 때문에 반환형이 String이다(문자열)
						//-변환 명령을 이용하여 원하는 형태로 바꿔 사용할 수 있다
						//-자동처리가 안되는경우 이처럼 수동으로 반환형을 바꿔줘야 한다
					    int boardNo = Integer.parseInt(request.getParameter("boardNo")); // 게시물 번호
					    BoardDto boardDto = boardDao.selectOne(boardNo); 
					    
							    if (boardDto != null && boardDto.getBoardWriter().equals(memberId)) {//소유자라면
							        return true; // 본인 게시물이므로 허용
							    } 
							    else {
							    	throw new AuthorityException("해당 게시글의 작성자만 수정 및 삭제 가능 ");
							    }							    
					} 
					else {
						throw new AuthorityException("로그인 후 이용 가능 ");
					}	
	}
}		
			

