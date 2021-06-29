package com.encore.spring.model.impl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.spring.domain.Book;
import com.encore.spring.model.BookDAO;

@Repository
public class BookDAOImpl implements BookDAO {

private SqlSession sqlSession;
	
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int addBook(Book book) throws Exception {
		int result = sqlSession.insert("book.addBook",book);
		return result;
	}

	@Override
	public int updateBook(Book book) throws Exception {
		int result = sqlSession.update("book.updateBook",book);
		return result;
	}

	@Override
	public Book getBook(String isbn) throws Exception {
		return sqlSession.selectOne("book.getBook",isbn);
	}

	@Override
	public int removeBook(String isbn) throws Exception {
		int result = sqlSession.delete("book.removeBook",isbn);
		return result;
	}

	@Override
	public List<Book> getBookList(Book book) throws Exception {
		return sqlSession.selectList("book.getBookList",book);
	}



}
