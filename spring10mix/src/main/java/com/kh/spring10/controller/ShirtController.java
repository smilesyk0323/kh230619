package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dto.ShirtDto;

@Controller
@RequestMapping("/shirt")
public class ShirtController {
	
		@Autowired
		private ShirtDao dao;
		
		
		@GetMapping("/add")
		public String insert() {
			return "/WEB-INF/views/shirt/add.jsp";
		}
		
		@PostMapping("/add")
		public String insert(@ModelAttribute ShirtDto dto) {
			int shirtNo = dao.sequence();
			dto.setShirtNo(shirtNo);//TDD 테스트 주도 개발=미리 검증하고 만드는 방식!
			dao.insert(dto);
		//return "redirect:list"; 리스트로 보낼지 아래의 상세로 갈지는 선택! 
			return "redirect:detail?shirtNo="+shirtNo;
		}
		
		
		@RequestMapping("/list")
		public String list(Model model) {//등록된 목록을 화면에 찍으려면 model이 필요! 
			List<ShirtDto>list = dao.selectList();
			model.addAttribute("list", list);
			return "/WEB-INF/views/shirt/list.jsp";
		}
		
		@RequestMapping("/detail")
			public String detail(@RequestParam int shirtNo, Model model	) {
			ShirtDto dto = dao.selectOne(shirtNo);
			model.addAttribute("dto", dto);
			return "/WEB-INF/views/shirt/detail.jsp";
		}

		
		@RequestMapping("/delete")
		public String delete(@RequestParam int shirtNo) {
			boolean result = dao.delete(shirtNo);
			if(result) {
				//return "redirect:list";
				return "redirect:/shirt/list";
			}
			else {
				return "redirect:오류페이지";
			}
		}
		
		
		@GetMapping("/edit")
		public String update(@RequestParam int shirtNo, Model model) {
			ShirtDto dto = dao.selectOne(shirtNo);
			model.addAttribute("dto", dto);
			return "/WEB-INF/views/shirt/edit.jsp";
		}
		@PostMapping("/edit")
		public String update(@ModelAttribute ShirtDto dto) {
				boolean result = dao.update(dto);
				if(result) {
					return "redirect:detail?shirtNo="+dto.getShirtNo();
				}
				else {
					return "redirect:에러페이지주소";
				}
		}
		
}


























