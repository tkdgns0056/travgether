package com.project.travgether.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class JdbcTest {
	//로깅을 위한 변수 선언
	private static final Logger logger= LoggerFactory.getLogger(JdbcTest.class);
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@59.13.235.172:1521/xe";
	private static final String USER ="treavegether";
	private static final String PW = "tg1234";

	
	@Test //Junit이 테스트하는 메소드
	public void test() throws ClassNotFoundException{
		Class.forName(DRIVER); //jdbc 드라이버 로딩
		
		//괄호안에 리소스 자동 삭제
		try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			logger.info("오라클 연결 완료");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
