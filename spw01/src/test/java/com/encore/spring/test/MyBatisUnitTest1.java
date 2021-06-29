package com.encore.spring.test;

import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.encore.spring.domain.UserVO;


//MyBatisFrmework 단위테스트...
public class MyBatisUnitTest1 {
	public static void main(String[] args) throws Exception{
		//1. 설정문서 읽어들여서
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		//2. SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		//3. SqlSession
		SqlSession session = factory.openSession();
		
		//4. 쿼리문 수행
	
		System.out.println("\n================================================");
	
		UserVO user = session.selectOne("UserMapper.getuserList", "admin");
		System.out.println(user);
	}
}
