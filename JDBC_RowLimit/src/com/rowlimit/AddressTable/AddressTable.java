package com.rowlimit.AddressTable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressTable {
	
	public static void displayData(ResultSet rs) throws SQLException
	{
		while(rs.next()) {
		StringBuffer sb =new StringBuffer();
		sb.append("Id " +rs.getInt("id") + " : ");
		sb.append(rs.getString("address"));
		System.out.println(sb.toString());
	}}

}
