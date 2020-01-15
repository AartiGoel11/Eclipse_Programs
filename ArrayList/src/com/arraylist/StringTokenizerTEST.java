package com.arraylist;

import java.util.StringTokenizer;

public class StringTokenizerTEST {

	public static void main(String[] args) {
 /* StringTokenizer str1 = new StringTokenizer("Hello Geeks How are you", " ");
  while(str1.hasMoreTokens())
	  System.out.println(str1.nextToken());*/
	
	  StringTokenizer str2 = new StringTokenizer("Java:C++:SQL:Python:JavaScript", ":");
	  while(str2.hasMoreTokens())
		  System.out.println(str2.nextToken());
}
}