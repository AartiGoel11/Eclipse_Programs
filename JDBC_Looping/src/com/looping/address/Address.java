package com.looping.address;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Address {

	public static void displayData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			StringBuffer sb = new StringBuffer();
			sb.append("ID " + rs.getInt("id") + ":");
			sb.append(rs.getString(2));
			System.out.println(sb.toString());		}
	}

}
