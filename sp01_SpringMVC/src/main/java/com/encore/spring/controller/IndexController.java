package com.encore.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView(); //뷰페이지 이동, 이동경로, 데이터 바인딩까지 다할 수 있음
		mv.setViewName("result");//확장자 안써도됨
		mv.addObject("message","Hello SpringMVC Frameword!!");
		
		return mv;
	}

}
