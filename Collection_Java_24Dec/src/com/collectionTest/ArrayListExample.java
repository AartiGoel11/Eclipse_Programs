package com.collectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(43);
		li.add(33);
		li.add(67);
		li.add(3);
		li.add(4);
		
		System.out.println(li.size());
		li.remove(1);
		li.remove(2);
		System.out.println("size after removing elements "+li.size());
		
		for(Integer i : li)
			System.out.println(i);
	}}
