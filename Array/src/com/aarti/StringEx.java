package com.aarti;

import java.util.ArrayList;
import java.util.List;

public class StringEx {

	public static void main(String[] args) {
		String str = "Aarti";
		
		char[] a= str.toCharArray();
		//char [] new1;
		System.out.println(str+"------");
		for(int i =str.length()-1;i>0;i--)
		{  System.out.println(a[i]);
		
		System.out.println(a.toString());
	}

}}
