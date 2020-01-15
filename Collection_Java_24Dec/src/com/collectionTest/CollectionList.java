package com.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionList {
	
	public static void main(String[] args) {
		
		/*ArrayList<String> obj = new ArrayList<>(Arrays.asList("Aarti","Nidhi","Golu"));
		System.out.println(obj);*/
		
		/*List<Integer> obj1 = new ArrayList<>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		System.out.println(obj1);
		*/
		ArrayList<Integer> item = new ArrayList<>(Collections.nCopies(10, 7));
		//System.out.println(item);
		
		/*for(int i=0;i<item.size();i++)
		{
			System.out.println(item.get(i));
		}*/
		
		/*for(Integer i : item)
		{
			System.out.println(i);
		}
		*/
		
		/*int count =0;
		while(item.size()>count)
		{
			System.out.println(item.get(count));
			count++;
		}*/
		
		Iterator<Integer> itr = item.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterat
				
		
	}

}
