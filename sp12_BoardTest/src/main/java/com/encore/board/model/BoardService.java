package com.encore.board.model;

import java.util.List;

import com.encore.board.domain.BoardVO;

public interface BoardService {
	int write(BoardVO vo);
	//String selectByNoForDate(int no);
	List<BoardVO> boardList(BoardVO boardVO);
}
