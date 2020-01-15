package com.aarti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String username = "root";
	private static final String password = "root";
	private static final String conn_string = "jdbc:mysql://localhost:3306/testing";

	public static Connection getConnection(DBType dbtype) throws SQLException {
		switch (dbtype) {
		case MYSQL:
			return DriverManager.getConnection(conn_string, username, password);
		default:
			return null;
		}
	}
public static void processMessage(SQLException e)
{
	System.err.println("Error message "+e.getMessage());
	System.err.println("Error code "+e.getErrorCode());
	System.err.println("SQL state "+e.getSQLState());
}
}
