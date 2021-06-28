package com.encore.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewResolverController {

	@RequestMapping("register.do")
	public ModelAndView register() {
		System.out.println("register() calling...");
		return new ModelAndView("register_result","info","InternalResourceViewResolver...");
	}
}
