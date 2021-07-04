package com.encore.board.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.board.domain.Member;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSession sqlSession;
	final String NS = "sql.member.mapper.";
	@Override
	public Member selectUser(Member member) {
		
		return sqlSession.selectOne(NS+"selectUser", member);
	}

}
