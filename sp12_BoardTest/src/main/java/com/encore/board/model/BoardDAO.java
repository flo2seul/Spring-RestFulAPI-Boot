package com.encore.board.model;

import java.util.List;

import com.encore.board.domain.BoardVO;

public interface BoardDAO {
	int write(BoardVO vo);
	String selectByNoForDate(int no);
	public List<BoardVO> boardList(BoardVO boardVO);
}
