package com.aarti1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	private static final String username = "root";
	private static final String password = "root";
	private static final String conn_string = "jdbc:mysql://localhost:3306/testing";

	public static void main(String[] args) throws SQLException {
		
		try {
			Connection conn = DriverManager.getConnection(conn_string, username, password);
			System.out.println("connection establised");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from address");
			
			rs.last(); //This method will move the cursor pointer to the last row of the table.
			System.out.println("Number of rows " + rs.getRow()); // This method is used to count the number of rows in the table.
		} catch (SQLException e) {
			System.err.println(e);
			System.out.println("connection is not established ");
			e.printStackTrace();
		} 
		}

	}


