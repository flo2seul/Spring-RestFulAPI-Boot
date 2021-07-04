package com.encore.board.model;


import com.encore.board.domain.Member;

public interface MemberDAO {
	
	Member selectUser(Member member);
	
	

}
