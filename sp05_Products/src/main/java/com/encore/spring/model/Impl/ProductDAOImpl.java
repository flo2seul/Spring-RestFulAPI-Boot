package com.encore.spring.model.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.spring.domain.Product;
import com.encore.spring.model.ProductDAO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "ProductMapper.";

	@Override
	public void addProduct(Product vo) throws Exception {
		
		sqlSession.insert(NS+"addProduct",vo);
	}

	@Override
	public List<Product> findByProductName(String words) throws Exception {
		
		return sqlSession.selectList(NS+"findByProductName",words);
	}

	@Override
	public List<Product> findProducts() throws Exception {
		
		return sqlSession.selectList(NS+"findProducts");
	}

	@Override
	public List<Product> findByProductMaker(String words) throws Exception {
		
		return sqlSession.selectList(NS+"findByProductMaker",words);
	}
	
}
