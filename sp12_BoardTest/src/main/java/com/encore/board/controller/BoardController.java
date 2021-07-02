package com.encore.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.encore.board.domain.BoardVO;
import com.encore.board.domain.MemberVO;
import com.encore.board.model.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("write.do")
	public String write(BoardVO bvo, HttpSession session,Model model ) throws Exception{
		MemberVO mvo = (MemberVO)session.getAttribute("mvo");
		if(mvo==null) return "redirect:index.jsp";
		
		bvo.setMemberVO(mvo);
		model.addAttribute("bvo", bvo);
		boardService.write(bvo);
		
		System.out.println("BVO::"+bvo);
		return "board/show_content";
	}
	@RequestMapping("list.do")
	public String boardList(BoardVO bvo, Model model) {
        
        List<BoardVO> list = boardService.boardList(bvo);
        model.addAttribute("list", list);
        
        return "board/list";
    }
	@RequestMapping("showContent.do")
	public String showContent(int no, Model model) throws Exception{
		
		boardService.updateCount(no);
		BoardVO vo = boardService.showContent(no);
        model.addAttribute("bvo", vo);
   
		
		return"board/show_content";
				
	}
	@RequestMapping("updateView.do")
	public String updateView(int no, Model model) throws Exception{
		BoardVO vo = boardService.showContent(no);
		model.addAttribute("bvo",vo);
		return "board/update";
	
				
	}
	
	@RequestMapping("updateBoard.do")
	public String updateBoard(BoardVO vo) throws Exception{
		 
		boardService.updateBoard(vo);
		return "redirect:list.do";
	
				
	}
	@RequestMapping("delete.do")
	public String deleteBoard(int no) throws Exception{
	
		boardService.deleteBoard(no);
		return "redirect:list.do";
	
				
	}
	

}
