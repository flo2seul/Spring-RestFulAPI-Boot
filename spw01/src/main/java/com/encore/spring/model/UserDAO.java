package com.encore.spring.model;



import java.util.List;

import com.encore.spring.domain.UserVO;


public interface UserDAO {

	public List<UserVO> login(String userId, String password) throws Exception;
}
