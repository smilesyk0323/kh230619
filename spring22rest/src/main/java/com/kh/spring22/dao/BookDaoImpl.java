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
	public boolean editUnit(int bookId, BookDto bookDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("bookId", bookId);
		params.put("dto", bookDto);
		return sqlSession.update("book.editUnit", params) > 0;
	}



}















