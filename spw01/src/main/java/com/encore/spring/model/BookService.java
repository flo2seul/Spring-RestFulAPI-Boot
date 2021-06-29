package com.encore.spring.model;


import java.util.List;

import com.encore.spring.domain.Book;


public interface BookService {

	void addBook(Book book) throws Exception;
	void updateBook(Book book) throws Exception;
	Book getBook(String isbn) throws Exception;
	List<Book> getBookList(Book book) throws Exception;
}