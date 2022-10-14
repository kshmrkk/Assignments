package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static Connection createConnection() {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String userName = "SYSTEM";
		String password = "123";
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
