package com.project.travgether.persistence;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@59.13.235.172:1521/xe",
				"treavegether",
				"tg1234"
				)){
			System.out.println(con);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
