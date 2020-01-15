package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseStringMain {

	public static void main(String[] args) {
		String string1="GeeksForGeeks";
		char[] char1 = string1.toCharArray();
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(char c : char1)
			list.add(c);
		Collections.reverse(list);
		
		Iterator<Character> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}

	}

}
