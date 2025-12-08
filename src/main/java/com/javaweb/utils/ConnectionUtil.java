package com.javaweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=DB_JAVA;encrypt=false;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASSWORD = "123456";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			// Load driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy JDBC Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Lỗi kết nối SQL Server!");
			e.printStackTrace();
		}

		return conn;
	}
}
