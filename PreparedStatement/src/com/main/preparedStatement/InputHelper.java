package com.main.preparedStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper {
	public static String getInput(String prompt)
	{
		BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		System.out.flush();
		
		try
		{
			return stdin.readLine();
		}
		catch(Exception e)
		{
			return "Error: " +e.getMessage();
			}
		double getDoubleInput(String prompt1) throws NumberFormatException
		{
			String input = getInput(prompt1);
			return Double.parseDouble(input);
		}
		
	}

}
