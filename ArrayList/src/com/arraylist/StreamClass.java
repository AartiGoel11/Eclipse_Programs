package com.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
   List<Integer> values = Arrays.asList(1,2,4,5,6,7);
   Stream<Integer> s = values.stream();
   s.forEach(System.out::println);
   s.forEach(System.out::println);


	}

}
