package com.encore.spring.model;


import java.util.List;



import com.encore.spring.domain.Book;


public interface BookDAO {

	int addBook(Book book) throws Exception;
	int updateBook(Book book) throws Exception;
	Book getBook(String isbn) throws Exception;
	int removeBook(String isbn) throws Exception;
	List<Book> getBookList(Book book) throws Exception;
}