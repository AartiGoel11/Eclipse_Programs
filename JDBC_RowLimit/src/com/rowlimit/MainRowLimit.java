package com.rowlimit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rowlimit.AddressTable.AddressTable;

public class MainRowLimit {
	private static final String username = "root";
	private static final String password = "root";
	private static final String conn_string = "jdbc:mysql://localhost:3306/testing";

	public static void main(String[] args)  {
	//	ResultSet rs = null;
		try (Connection conn = DriverManager.getConnection(conn_string, username, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from address  LIMIT 2,1");
) {
			AddressTable.displayData(rs);
			System.out.println("addressssssss");

		} catch (SQLException e) {
			System.err.println("error " + e);
		}
		}
	}


