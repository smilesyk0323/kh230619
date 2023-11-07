package com.kh.spring22.dao;

import java.util.List;

import com.kh.spring22.dto.BookDto;

public interface BookDao {

	void insert(BookDto bookDto);
	boolean delete(int bookId);
	List<BookDto> selectList();
	BookDto selectOne(int bookId);
	List<BookDto> searchByTitle(String bookTitle);
	void edit(int bookId, BookDto bookDto);
	List<BookDto> selectListByPage(int page, int size);//무한스크롤


}
