package com.encore.spring.model.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.spring.domain.Book;
import com.encore.spring.model.BookDAO;
import com.encore.spring.model.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
private BookDAO bookDAO;
	
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	public void addBook(Book book) throws Exception {
		bookDAO.addBook(book);
	}

	@Override
	public void updateBook(Book book) throws Exception {
		bookDAO.updateBook(book);
	}

	@Override
	public Book getBook(String isbn) throws Exception {
		
		return bookDAO.getBook(isbn);
	}

	@Override
	public List<Book> getBookList(Book book) throws Exception {
		
		return bookDAO.getBookList(book);
	}

}
