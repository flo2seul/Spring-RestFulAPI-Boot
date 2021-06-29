package com.encore.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.UserVO;
import com.encore.spring.model.impl.UserDAOImpl;

@Controller
public class UserController {
	
	@RequestMapping("front.do")
	public ModelAndView front(HttpServletRequest request, String userId,String password) throws Exception {
		String path="error.jsp";
		UserVO user= UserVO.getUserVO(userId);
		HttpSession session = request.getSession();
		if(user!=null) {
			if(user.getPassword().equals(password)) {
				session.setAttribute("vo", user);
				path="loginSucess.jsp";
			}
		}
		return new ModelAndView(path);
	}

}
