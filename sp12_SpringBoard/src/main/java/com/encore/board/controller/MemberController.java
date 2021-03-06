package com.encore.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.encore.board.domain.Member;
import com.encore.board.model.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("login")
	public String doLogin(Member pvo, HttpSession session, Model model) {
		try {
			Member rvo = memberService.selectUser(pvo);
			if(rvo != null) {
				session.setAttribute("mvo",rvo);
			}
			return "member/login_result";
		} catch (Exception e) {
			model.addAttribute("message","로그인 작업-에러 발생");
			return "Error";
		}
	}
	@RequestMapping("logout.do")
	public String doLogout(HttpSession session) throws Exception{
		Member mvo = (Member)session.getAttribute("mvo");
		if(mvo!=null) session.invalidate();
		
		return "redirect:index.jsp";
	}
	

}
