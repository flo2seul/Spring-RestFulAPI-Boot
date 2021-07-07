package com.encore.spring.model;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.encore.spring.domain.Product;

//Transcation 처리는 1) 설정문서 2)인터페이스 3) Impl 클래스 4) 처리하고자 하는 메소드에다 지정하면 된다.

@Transactional
public interface ProductCatalog {
	void addProduct(Product vo) throws Exception;
	List<Product> findByProductName(String words) throws Exception;
	List<Product> findProducts() throws Exception;
	List<Product> findByProductMaker(String words) throws Exception;
	
}
