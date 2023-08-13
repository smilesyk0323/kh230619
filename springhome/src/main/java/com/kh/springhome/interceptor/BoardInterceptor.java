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

@Component
public class BoardInterceptor implements HandlerInterceptor{

	
		@Autowired
		 private BoardDao boardDao;

		
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
					HttpSession session = request.getSession();	
					String memberId = (String) session.getAttribute("name");
					
					
					if (memberId != null) {
					    int boardNo = Integer.parseInt(request.getParameter("boardNo")); // 게시물 번호
					    BoardDto boardDto = boardDao.selectOne(boardNo); 
					            
							    if (boardDto != null && boardDto.getBoardWriter().equals(memberId)) {
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
			

