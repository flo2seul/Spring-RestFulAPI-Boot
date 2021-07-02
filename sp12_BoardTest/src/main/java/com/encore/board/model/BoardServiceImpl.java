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


}
