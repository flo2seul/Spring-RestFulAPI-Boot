package com.encore.spring.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.encore.spring.domain.Product;

//JUnit 사용해서 단위테스트...

public class MyBatisUnitTest2 {
	
	@Test 
	public void unit() throws Exception{
		//1. 설정문서 읽어들여서
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		//2. SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		//3. SqlSession
		SqlSession session = factory.openSession();
		
		//4. 쿼리문 수행
		List<Product> list = session.selectList("ProductMapper.getAllProductList");
		for(Product vo : list) System.out.println(vo);
		
		System.out.println("\n================================================");
		
		Product item = session.selectOne("ProductMapper.getProductListName","통돌이");
		System.out.println(item);
	}
}
