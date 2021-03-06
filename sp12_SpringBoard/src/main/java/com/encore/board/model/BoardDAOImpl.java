package com.encore.board.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.board.domain.Board;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	final String NS = "sql.board.mapper.";
	@Override
	public int write(Board vo) {
		
		return sqlSession.insert(NS+"write", vo) ;
	}

	@Override
	public List<Board> BoardList(Board vo) {
		
		return sqlSession.selectList(NS+"getBoardList", vo);
		
	}

	@Override
	public Board showContent(int no) {
		
		return sqlSession.selectOne(NS+"showContent", no);
	}

	@Override
	public void updateBoard(Board vo) {
		sqlSession.update(NS+"updateBoard", vo);
		
		
		
	}

	@Override
	public void deleteBoard(int no) {
		sqlSession.delete(NS+"deleteBoard",no);
		
	}

	@Override
	public void updateCount(int no) {
		sqlSession.update(NS+"updateCount", no);
		
	}

}
