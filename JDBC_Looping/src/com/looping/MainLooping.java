package com.looping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.looping.address.Address;

public class MainLooping {
	private static final String username = "root";
	private static final String password = "root";
	private static final String conn_string = "jdbc:mysql://localhost:3306/testing";

	public static void main(String[] args) throws SQLException {
		
		try (Connection conn = DriverManager.getConnection(conn_string, username, password);

				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from address");) // try with resource example
		{
			System.out.println("connection established");
			Address.displayData(rs);
			 rs.last();
			 System.out.println("the last row "+ rs.getRow());
			 rs.first();
			 System.out.println("the first address is "+rs.getString("address"));
			 rs.last();
			 System.out.println("the last id "+rs.getInt("id"));
			 rs.absolute(4);
			 System.out.println("id at row 2 "+rs.getInt("id") + "address at row 2 "+rs.getString("address"));
		} catch (SQLException e) {
			System.err.println("exception occured " + e);
		}

	}

}
