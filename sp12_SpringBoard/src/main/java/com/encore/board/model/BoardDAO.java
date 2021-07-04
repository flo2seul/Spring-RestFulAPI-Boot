package com.encore.board.model;

import java.util.List;

import com.encore.board.domain.Board;

public interface BoardDAO {
	int write(Board vo);
	List<Board> BoardList(Board vo);
	Board showContent(int no);
	void updateBoard(Board vo);
	void deleteBoard(int no);
	void updateCount(int no);
}
