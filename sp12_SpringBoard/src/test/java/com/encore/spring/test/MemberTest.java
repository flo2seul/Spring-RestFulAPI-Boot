package com.encore.spring.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;

import com.encore.board.domain.Member;

public class MemberTest {
	public static void main(String[] args) throws Exception {
		
		Reader r = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		Member member = session.selectOne("sql.member.mapper.selectUser","encore" );
		System.out.println(member);
	}

}
