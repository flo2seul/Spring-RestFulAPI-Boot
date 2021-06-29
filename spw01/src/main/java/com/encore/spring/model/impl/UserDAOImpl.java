
package com.encore.spring.model.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.encore.spring.domain.UserVO;
import com.encore.spring.model.UserDAO;

public class UserDAOImpl implements UserDAO{

	private SqlSession sqlSession;
	

	public UserDAOImpl() {
		super();
	}


	@Override
	public List<UserVO> login(String userId, String password) throws Exception {
		
		return sqlSession.selectList("user.getuserList",userId);
	}



}
