package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.BoardDao;
import com.kh.spring06.dto.BoardDto;

@RestController
public class BoardController {
	@Autowired	
	private BoardDao dao;
	
	@RequestMapping("/insert")
	public String insert(
			@ModelAttribute BoardDto dto) {
		dao.insert(dto);
		return "게시물등록 완료";
	}	
	
	 @RequestMapping("/update")
	 	public String update(@ModelAttribute BoardDto dto) {
//		 	boolean result = dao.update(dto);		 
		 if(dao.update(dto)) {
			 return "게시물 변경 완료 ";
		 }
		 else {
			 return"해당 게시물이 존재하지 않습니다";
		 }		 
	 }	 	
}
