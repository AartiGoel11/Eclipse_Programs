package com.aarti;

import java.sql.*;

public class Main {
	private static final String username = "root";
	private static final String password = "root";
	private static final String conn_string = "jdbc:mysql://localhost:3306/testing";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(conn_string, username, password);
			System.out.println("connection establised");
			st = conn.createStatement();
			rs = st.executeQuery("select * from address");
			rs.last(); //This method will move the cursor pointer to the last row of the table.
			System.out.println("Number of rows " + rs.getRow()); // This method is used to count the number of rows in the table.
		} catch (SQLException e) {
			System.err.println(e);
			System.out.println("connection is not established ");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
				System.out.println("result set connection is closed");
			}
			if (st != null) {
				st.close();
				System.out.println("statement connection is closed");
			}
			if (conn != null) {
				conn.close();
				System.out.println("connection is closed"); //At the end we need to close all the connections in a reverse order like rs,st,conn
			}
		}
	}

}
