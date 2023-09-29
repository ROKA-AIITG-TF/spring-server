package com.aiitg.helplus;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aiitg.helplus.data.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
					"file:src/main/webapp/WEB-INF/web.xml",
					"file:src/main/webapp/WEB-INF/DispatherServlet-servlet.xml"
		})

public class TestControllerTest {
	
	@InjectMocks
	private TestDao testDao;

    @Before
    public void setup() {

    }

    @Test
    public void testGetSomeData() throws Exception {
        // Given
        String okString = "DB-OK!"; // 성공할 경우 비교할 문자열 변수 
        String result = testDao.getTest();

        // When & Then
        System.out.println(result);

    }
}
