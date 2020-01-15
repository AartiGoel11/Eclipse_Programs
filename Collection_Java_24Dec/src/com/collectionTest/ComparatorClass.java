package com.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li =new ArrayList<>(Arrays.asList("aarti","neha"));
		System.out.println(li);
		
		List<String> obj = new ArrayList<>()
				{{
					
					add("name1");
					add("name2");
					add("name3");
				}
				};
		System.out.println(obj);
		
			List<String> add = new ArrayList<>(Collections.nCopies(10, "aarti"));
			System.out.println(add);
			
			List<Integer> in = new ArrayList<Integer>();
			in.add(1);
			in.add(2);
			in.add(3);
			System.out.println(in);
			
		}
	}

	

	