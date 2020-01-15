package com.main.preparedStatement.address;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Address {
	
	public static void displayData(ResultSet rs) throws SQLException
	{
		rs.last();
		if(rs.getRow()==0)
		{
			System.out.println("No address is there in the table");
		}
		else
		{
			System.out.println("No of addresses in the table "+rs.getRow());
			rs.beforeFirst();
		}
		while(rs.next())
		{
			StringBuffer sb= new StringBuffer();
			sb.append("id " +rs.getInt("id"));
			sb.append(rs.getString("address"));
			System.out.println(sb.toString());
		}
		
	}

}
