package com.aiitg.helplus.data.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aiitg.helplus.data.dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao{
	
	private final SqlSessionTemplate sqlSession;
	final String NAME_SPACE = "TestDao."; 
	
	@Autowired
	TestDaoImpl(SqlSessionTemplate sqlSession){
		this.sqlSession = sqlSession;
		
	}
	
	public String getTest() {
		return sqlSession.selectOne(NAME_SPACE + "getTest");
	}

}
