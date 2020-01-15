package com.arraylist;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerMain {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		StringJoiner str1 = new StringJoiner(";");
		try
		{str1.setEmptyValue(null);}
		catch(NullPointerException e)
		{ System.out.println("caught the exception....");
			e.printStackTrace();
		}
		System.out.println(str1);
		str1.add(list.get(0)).add(list.get(1));
		System.out.println(str1);
		System.out.println("Length of the string..."+str1.length());
		
		StringJoiner str2 = new StringJoiner(":");
		str2.add(list.get(2)).add(list.get(3));
		System.out.println("String str 2.." +str2);
		
		str1.merge(str2);
		System.out.println("String str1 after merging with str2 "+str1);
		System.out.println("Length of str1 after merging."+str1.length());
		
		
	   System.out.println("To string..."+str1.toString());
	   
	   str1.setEmptyValue("nnnnnnn");
	   System.out.println(str1);
		
		

	}

}
