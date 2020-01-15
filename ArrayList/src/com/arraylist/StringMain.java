package com.arraylist;

public class StringMain {

	public static void main(String[] args) {
  String string1 = "GeeksForGeeks";
  
  char[] char1=string1.toCharArray();
  
  for(int i=char1.length-1;i>=0;i--)
	  System.out.print(char1[i]);
	}

}
