package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="도서 관리", description = "도서 정보 관리를 위한 controller")
@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@Autowired
	private BookDao bookDao;
	
	//조회
	@GetMapping("/")
	public List<BookDto> list(){
		return bookDao.selectList();
	}
	
	//상세 조회
	@GetMapping("/{bookId}")
	public BookDto find(@PathVariable int bookId){
		return bookDao.selectOne(bookId);
	}

	//도서명 검색
	@GetMapping("/bookTitle/{bookTitle}")
	public ResponseEntity<List<BookDto>> searchByTitle(@PathVariable String bookTitle){
		List<BookDto> matchingBooks = bookDao.searchByTitle(bookTitle);
		return !matchingBooks.isEmpty() ? ResponseEntity.ok(matchingBooks) : ResponseEntity.notFound().build();
	}

	//등록
	@PostMapping("/")
	public void insert(@RequestBody BookDto bookDto) {
		bookDao.insert(bookDto);
	}
	
	
	@PutMapping("/{bookId}")
	public void update(@RequestBody BookDto bookDto, @PathVariable int bookId) {
		//bookDto에 모든 항목이 있는지 검사해야함
		bookDao.edit(bookId, bookDto);
	}
	@PatchMapping("/{bookId}")
	public void update2(@RequestBody BookDto bookDto, @PathVariable int bookId) {
		//bookDto에 항목이 하나라도 있는지 검사해야함
		bookDao.edit(bookId, bookDto);
	}
	
	//삭제
	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> delete(@PathVariable int bookId){
		boolean result =bookDao.delete(bookId);
		if(result) {
			return ResponseEntity.ok().build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	//무한스크롤
	//FE에서 페이지 번호, 데이터 개수를 보낼 경우의 조회 매핑
	@GetMapping("/page/{page}/size/{size}")
	public List<BookDto> listByPage(@PathVariable int page, @PathVariable int size){
		return bookDao.selectListByPage(page,size);
	}
	
	
	

}
















