package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DisplayDuplicates {

	public static void main(String[] args) {
String str ="javaav";
displayDuplicatesString(str);
	}
 private static void displayDuplicatesString(String str) {
	 Map<Character,Integer> map = new HashMap<>();
	 char[] ch = str.toCharArray();
	 for(char c : ch)
	 {
		 if(!map.containsKey(c))
		 {
			 map.put(c, 1);
		 }
		 else
		 {
			 map.put(c, map.get(c)+1);
		 }
		 
		 Set<Map.Entry<Character, Integer>> entry= map.entrySet();
		 
		 for(Map.Entry<Character, Integer> entrySet : entry)
		 { if(entrySet.getValue()>1)
		 {
			 System.out.printf("%s : %d %n",entrySet.getKey(),entrySet.getValue());
		 }
			 
		 }
	 }
	 
	 
 }
 
}
