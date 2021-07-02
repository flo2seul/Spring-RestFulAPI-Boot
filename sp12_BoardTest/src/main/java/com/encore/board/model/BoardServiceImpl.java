package com.encore.board.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public int write(BoardVO vo) {
		int row=boardDAO.write(vo);
		System.out.println("Before vo ::" +vo);
		
		String date=boardDAO.selectByNoForDate(vo.getNo());
		vo.setWriteDate(date);
		return row;
	}



	@Override
    public List<BoardVO> boardList(BoardVO boardVO) {
        return boardDAO.boardList(boardVO);
    }



	@Override
	public BoardVO showContent(int no) {
		
		return boardDAO.showContent(no);
	}



	@Override
	public void updateBoard(BoardVO vo) {
		
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
