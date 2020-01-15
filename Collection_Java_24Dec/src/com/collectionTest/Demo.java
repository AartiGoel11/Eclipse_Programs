package com.collectionTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		 
	    // Add elements to LinkedList
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	 
	    // Obtaining ListIterator
	    Iterator listIt = linkedlist.descendingIterator();
	 
	    // Iterating the list in forward direction
	   /* System.out.println("Forward iteration:");
	    while(listIt.hasNext()){
	       System.out.println(listIt.next());
	    }*/

	    // Iterating the list in backward direction
	   
	    System.out.println("\nBackward iteration:");
	    while(listIt.hasNext()){
	       System.out.println(listIt.next());
	       
	      
	    } 
	    
	    linkedlist.push("Aarti");
		for(String s : linkedlist)
		{
			System.out.println("   " +s +"    ");
		}
		System.out.println(linkedlist.peekLast());
		for(String s : linkedlist)
		{
			System.out.println("   " +s +"    ");
		}
	
	}

}
