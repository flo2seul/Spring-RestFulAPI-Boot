package com.encore.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.encore.board.domain.Board;
import com.encore.board.domain.Member;
import com.encore.board.model.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("write.do")
	public String write(Board bvo, HttpSession session, Model model) throws Exception{
		Member mvo = (Member)session.getAttribute("mvo");
		if(mvo==null) return "redirect:index.jsp";
		
		bvo.setMember(mvo);
		model.addAttribute("bvo",bvo);
		boardService.write(bvo);
		
		System.out.println("BVO::"+bvo);
		return "board/show_content";
		
				
		
	}
	@RequestMapping("list.do")
	public String boardList(Board bvo, Model model) {
		List<Board> list = boardService.BoardList(bvo);
		model.addAttribute("list",list);
		
		return "board/list";
		
	}

	@RequestMapping("showContent.do")
	public String showContent(int no, Model model) throws Exception{
		boardService.updateCount(no);
		Board vo = boardService.showContent(no);
		model.addAttribute("bvo",vo);
		
		return "board/show_content";
	}
	
	@RequestMapping("updateView.do")
	public String updateView(int no, Model model) throws Exception{
		Board vo = boardService.showContent(no);
		model.addAttribute("bvo",vo);
		return "board/update";
	}
	
	@RequestMapping("updateBoard.do")
	public String updateBoard(Board vo) throws Exception{
		
		boardService.updateBoard(vo);
		return "redirect:list.do";
	}

	@RequestMapping("delete.do")
	public String deleteBoard(int no) throws Exception{
		boardService.deleteBoard(no);
		return "redirect:list.do";
	}
}
