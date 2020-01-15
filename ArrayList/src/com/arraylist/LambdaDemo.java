package com.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.println(i);
	}
}
public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		
		values.forEach(System.out::println);


	}

}
