package com.aarti;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection(DBType.MYSQL);
			System.out.println("connection establised");
			st = conn.createStatement();
			rs = st.executeQuery("select * from address");
			rs.last(); //This method will move the cursor pointer to the last row of the table.
			System.out.println("Number of rows " + rs.getRow()); // This method is used to count the number of rows in the table.
		} catch (SQLException e) {
//			System.err.println(e);
			DBUtil.processMessage(e);
			System.out.println("connection is not established ");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
				System.out.println("reslt set connection is closed");
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


