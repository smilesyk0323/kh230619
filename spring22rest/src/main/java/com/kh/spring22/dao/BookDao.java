package com.kh.spring22.dao;

import java.util.List;

import com.kh.spring22.dto.BookDto;

public interface BookDao {

	void insert(BookDto bookDto);
	boolean delete(int bookId);
	List<BookDto> selectList();
	boolean editUnit(int bookId, BookDto bookDto);
	BookDto selectOne(int bookId);
	List<BookDto> searchByTitle(String bookTitle);

}
