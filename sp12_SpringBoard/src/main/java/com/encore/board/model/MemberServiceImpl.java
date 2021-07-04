package com.encore.board.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.board.domain.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	@Override
	public Member selectUser(Member member) {
		
		return memberDAO.selectUser(member);
	}

}
