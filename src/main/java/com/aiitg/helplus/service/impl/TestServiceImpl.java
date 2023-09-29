package com.aiitg.helplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiitg.helplus.data.dao.TestDao;
import com.aiitg.helplus.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	private final TestDao testDao;
	
	@Autowired
	TestServiceImpl(TestDao testDao){
		this.testDao = testDao;
	}

	public String getTest() {
		return testDao.getTest();
	}

}
