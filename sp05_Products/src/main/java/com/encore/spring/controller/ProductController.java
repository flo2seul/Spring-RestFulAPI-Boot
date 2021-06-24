package com.encore.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.Product;
import com.encore.spring.model.ProductCatalog;

@Controller
public class ProductController {

	@Autowired
	private ProductCatalog productCatalog;
	
	@RequestMapping("myProduct.do")
	public ModelAndView insert(Product pvo) throws Exception{
		System.out.println("폼으로부터 받은 데이터"+pvo.getId());
		
		productCatalog.addProduct(pvo);
		
		System.out.println("폼으로부터 받은 데이터"+pvo.getId());
		
		return new ModelAndView("insert_result","info",pvo);
	}
	
	@RequestMapping("myProductSerch.do")
	public ModelAndView getProducts(String word, String command) throws Exception{
		String viewName = "";
		List<Product> list = null;
		
		if(command.equals("findByProductName")) {
			list = productCatalog.findByProductName(word);
			viewName = "find_result";
			
		}else if(command.equals("findByProductMaker")) {
			list = productCatalog.findByProductMaker(word);
			viewName = "find_result";
			
		}
		return new ModelAndView(viewName, "list",list);
	}
	
}
