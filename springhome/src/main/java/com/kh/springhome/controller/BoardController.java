package com.kh.springhome.controller;


import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.error.AuthorityException;
import com.kh.springhome.error.NoTargetException;


@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	//등록
	@GetMapping("/write")
		public String write() {
			return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
		public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
			String memberId = (String) session.getAttribute("name");//멤버아이디갖고오고
			int boardNo = boardDao.sequence();//시퀀스 번호 갖고오고
			boardDto.setBoardNo(boardNo);//보드 번호 넣고
			boardDto.setBoardWriter(memberId);//보드 작성자 넣고
			
			//이 사용자의 마지막 글번호를 조회
			Integer lastNo = boardDao.selectMax(memberId);
			
			//글을 등록하고 
			boardDao.insert(boardDto);//입력
			
			//포인트 계산 작업
			//- lastNo가 null이라는 것은 처음 글을 작성했다는 의미 
			//- lastNo가 null이 아니면 조회한 다음 시간차를 비교 
			//- 처음 게시글 작성과 이후 게시글 작성시 부여되는 포인트를 다르게 설정 가능 
			//게시글 작성시 포인트 +10 
			if(lastNo == null) {//글 작성한지 처음이라면
				memberDao.increaseMemberPoint(memberId, 10);	//10점 부여
			}
			else {//처음이 아니라면 시간 차이를 계산
				BoardDto lastDto = boardDao.selectOne(lastNo);
				Timestamp stamp = new Timestamp(
														lastDto.getBoardCtime().getTime());
				LocalDateTime lastTime = stamp.toLocalDateTime();
				LocalDateTime currentTime = LocalDateTime.now();//현재시간이 더 큰 시간
				
				Duration duration = Duration.between(lastTime, currentTime);
				long seconds = duration.getSeconds();//지금 작성하고 마지막 작성시간의 차이
				if(seconds >300) {//시간차가 300초(5분 초과)보다 크다면
					memberDao.increaseMemberPoint(memberId, 10);	//10점 부여
				}
			}
			
			
			return "redirect:detail?boardNo="+boardNo;
	}
	
		//목록(비회원접근가능)
		@RequestMapping("/list")
	public String list( Model model,  BoardDto boardDto) {
			List<BoardDto>list = boardDao.selectList(boardDto);	
			model.addAttribute("list",list);
//			model.addAttribute("list",boardDao.selectList(boardDto));
			return "/WEB-INF/views/board/list.jsp";
	}
		
	//상세(비회원 접근가능)
	@RequestMapping("/detail")
		public String detail(@RequestParam int boardNo,Model model, HttpSession session) {
			String memberId = (String) session.getAttribute("name");
			BoardDto findDto = boardDao.selectOne(boardNo);
			
			if(findDto.getBoardWriter().equals(memberId)) {	
				BoardDto boardDto = boardDao.selectOne(boardNo);
				model.addAttribute("boardDto",boardDto);
				return "/WEB-INF/views/board/detail.jsp";				
			}
			else {//작성자가 아닐경우 
				boardDao.updateRcount(boardNo);//조회수 증가 
				BoardDto boardDto = boardDao.selectOne(boardNo);
				model.addAttribute("boardDto",boardDto);
				return "/WEB-INF/views/board/detail.jsp";
			}			
		}
	
		//삭제 (컨트롤러에 직접 코드 작성시/강결합코드-어디가 어딘지(삭제와 권한검사) 구분이 불가)
	  	//- 만약 소유자 검사를 추가한다면 
		//- 현재 로그인 한 사용자와 게시글 작성자가 같다면 소유자로 판정 
		//- 같은 코드를 3번은 써야 적용가능 
//		@RequestMapping("/delete")
//		public String delete(@RequestParam int boardNo, HttpSession session) {
//			BoardDto boardDto = boardDao.selectOne(boardNo);//검사를 먼저
//			String boardWriter = boardDto.getBoardWriter();//작성자 가져오기		
//			String memberId = (String) session.getAttribute("name");//아이디 가져오기			
//			if(memberId.equals(boardWriter)) {//	if(소유자라면)
//				boardDao.deleteBoard(boardNo);
//				return "redirect:list";
//			}
//			else {
//				throw new AuthorityException("글 작성자가 아닙니다");
//			}		
//		}
		
		//삭제 (인터셉터)
		@RequestMapping("/delete")
		public String delete(@RequestParam int boardNo) {			
			boolean result = boardDao.deleteBoard(boardNo);
			if(result) {//삭제된다면
				return "redirect:list";
			}
			else {
				throw new NoTargetException("없는 게시글 번호");
			}			
		}
		
		//수정
		@GetMapping("/edit")
			public String edit(@RequestParam int boardNo, Model model) {		
				BoardDto boardDto = boardDao.selectOne(boardNo);
				model.addAttribute("boardDto", boardDto);
				return "/WEB-INF/views/board/edit.jsp";			 
		 }	
		@PostMapping("/edit")
			public String edit(@ModelAttribute BoardDto boardDto) {		
				boolean result = boardDao.updateBoardEdit(boardDto);
						if(result) {
							return "redirect:detail?boardNo="+ boardDto.getBoardNo();
						}
						else {
							throw new NoTargetException("존재하지 않는 글번호");
						}	
		}
	
		
	
 }
	












