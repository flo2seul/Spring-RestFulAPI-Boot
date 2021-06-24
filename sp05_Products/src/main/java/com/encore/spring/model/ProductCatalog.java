package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.Product;

public interface ProductCatalog {
	void addProduct(Product vo) throws Exception;
	List<Product> findByProductName(String words) throws Exception;
	List<Product> findProducts() throws Exception;
	List<Product> findByProductMaker(String words) throws Exception;
	
}
