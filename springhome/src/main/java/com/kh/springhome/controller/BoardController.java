package com.kh.springhome.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;


@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	//등록
	@GetMapping("/write")
		public String write() {
			return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
		public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
			String boardWriter = (String) session.getAttribute("name");//멤버아이디갖고오고
			int boardNo = boardDao.sequence();//시퀀스 번호 갖고오고
			boardDto.setBoardNo(boardNo);//보드 번호 넣고
			boardDto.setBoardWriter(boardWriter);//보드 작성자 넣고
			boardDao.insert(boardDto);//입력
			return "redirect:detail?boardNo="+boardNo;
	}
	
	//상세(비회원 접근가능)
	@RequestMapping("/detail")
		public String detail(HttpSession session,Model model) {
			String boardNo = (String) session.getAttribute("name");
			BoardDto boardDto = boardDao.selectOne(boardNo);
			model.addAttribute("boardDto",boardDto);
			return "/WEB-INF/views/board/detail.jsp";
		}
	
	//목록(비회원접근가능)
	@RequestMapping("/list")
		public String list( Model model, BoardDto boardDto) {
		List<BoardDto>list = boardDao.selectList(boardDto);
		model.addAttribute("list",list);
		return "/WEB-INF/views/board/list.jsp";
	}
	
	//수정
	@GetMapping("/edit")
		public String edit(HttpSession session, Model model) {
		String boardNo = (String) session.getAttribute("name");
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto inputDto,
								HttpSession session) {
		String boardNo = (String) session.getAttribute("name");
		boardDao.updateBoardEdit(inputDto);
		return "redirect:detail?boardNo="+boardNo;
		
	}

}










