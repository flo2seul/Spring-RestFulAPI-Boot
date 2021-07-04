package com.encore.board.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.board.domain.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	@Override
	public int write(Board vo) {
		
		return boardDAO.write(vo);
	}

	@Override
	public List<Board> BoardList(Board vo) {
		
		return boardDAO.BoardList(vo);
	}

	@Override
	public Board showContent(int no) {
		
		return boardDAO.showContent(no);
	}

	@Override
	public void updateBoard(Board vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(int no) {
		boardDAO.deleteBoard(no);
	}

	@Override
	public void updateCount(int no) {
		boardDAO.updateCount(no);
	}

}
