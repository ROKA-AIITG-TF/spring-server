package com.aiitg.helplus;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class DbConnectTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	/*
	 * 1. db연결 테스
	 * */
    
    private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "";
    // 단순 연결 테스
    @Test
    public void testConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            assertNotNull("Database connection should not be null!", conn);
        } catch (Exception e) {
            fail("Database connection failed: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    // ignore
                }
            }
        }
    }
}
