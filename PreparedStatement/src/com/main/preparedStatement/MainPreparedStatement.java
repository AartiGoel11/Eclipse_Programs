package com.main.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.main.preparedStatement.address.Address;

public class MainPreparedStatement {
	private static final String username = "root";
	private static final String password = "root";
	
	private static final String conn_string = "jdbc:mysql://localhost:3306/testing";
	public static final String SQL = "select * from address where id < ?";

	public static void main(String[] args) throws SQLException {
		try (Connection conn = DriverManager.getConnection(conn_string, username, password);
				PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery();) {
		Address.displayData(rs);
		

		}
		catch(SQLException e)
		{
			System.out.println("error "+e);
		}
	}

}
