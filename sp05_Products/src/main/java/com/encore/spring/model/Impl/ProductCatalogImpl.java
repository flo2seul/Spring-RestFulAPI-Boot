package com.encore.spring.model.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.spring.domain.Product;
import com.encore.spring.model.ProductCatalog;
import com.encore.spring.model.ProductDAO;

@Service
public class ProductCatalogImpl implements ProductCatalog {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public void addProduct(Product vo) throws Exception {
		productDAO.addProduct(vo);
		
	}

	@Override
	public List<Product> findByProductName(String words) throws Exception {
		return productDAO.findByProductName(words);
	}

	@Override
	public List<Product> findProducts() throws Exception {
		return productDAO.findProducts();
	}

	@Override
	public List<Product> findByProductMaker(String words) throws Exception {
		return productDAO.findByProductMaker(words);
	}
	
	

}
