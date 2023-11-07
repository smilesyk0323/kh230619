package com.kh.spring22.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;
import com.kh.spring22.error.NoTargetException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(BookDto bookDto) {
		sqlSession.insert("book.save", bookDto);
	}

	@Override
	public BookDto selectOne(int bookId) {
		BookDto bookDto = sqlSession.selectOne("book.find", bookId);
		if(bookDto == null) throw new NoTargetException();
		return bookDto;
	}

	@Override
	public List<BookDto> searchByTitle(String bookTitle) {
		List<BookDto> list = sqlSession.selectList("book.findByBookTitle", bookTitle);
		return list;
	}

	@Override
	public boolean delete(int bookId) {
		return sqlSession.delete("book.remove", bookId) > 0;
	}
	
	@Override
	public List<BookDto> selectList(){
		return sqlSession.selectList("book.list");
	}

	@Override
	public void edit(int bookId, BookDto bookDto) {
		Map<String, Object> param = Map.of("bookId", bookId, "bookDto", bookDto);
		int result = sqlSession.update("book.change", param);
		if(result == 0) throw new NoTargetException();
	}
	
	@Override//무한 스크롤
	public List<BookDto> selectListByPage(int page, int size) {
		int end = page * size;
		int begin = end - (size - 1) ;
		Map<String, Object> params = Map.of("begin", begin, "end", end);
		return sqlSession.selectList("book.selectListByPage", params);
	}


}















