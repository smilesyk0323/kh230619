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
	
	//일부만 수정
	@PatchMapping("/{bookId}")
	public ResponseEntity<String> editUnit(
			@PathVariable int bookId, @RequestBody BookDto bookDto){
		boolean result = bookDao.editUnit(bookId, bookDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
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
	
	
	

}
















