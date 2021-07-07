package com.encore.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.encore.spring.domain.Product;
import com.encore.spring.model.ProductCatalog;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("api")
@CrossOrigin(origins= {" * "}, maxAge = 6000)
@Api(tags = {"Product"})
public class ProductController {
	
	@Autowired
	private ProductCatalog myProductCatalog;
	
//	@RequestMapping(value="myProduct.do", method=RequestMethod.POST)
	@GetMapping("findAllProduct")
	public ResponseEntity<List<Product>> findAllProduct() throws Exception{
		
		List<Product> pvo = myProductCatalog.findProducts();
		
		if(pvo.isEmpty()) return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Product>>(pvo, HttpStatus.OK);
			
		
	}
	@GetMapping("findByProductName/{name}")
	public ResponseEntity<List<Product>> findByProductName(@PathVariable String name) throws Exception{
		

		List<Product> pvo = myProductCatalog.findByProductName(name);
		if(pvo.isEmpty()) return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Product>>(pvo, HttpStatus.OK);
	}
	
	@GetMapping("findByProductMaker/{maker}")
	public ResponseEntity<List<Product>> findByProductMaker(@PathVariable String maker) throws Exception{
		

		List<Product> pvo = myProductCatalog.findByProductMaker(maker);
		if(pvo.isEmpty()) return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Product>>(pvo, HttpStatus.OK);
	}
	
	@PostMapping("addProduct")
	public ResponseEntity<Product>  addProduct(@RequestBody Product pvo) throws Exception{
		
		myProductCatalog.addProduct(pvo);
		return new ResponseEntity<Product>(HttpStatus.OK);
	}

}




















