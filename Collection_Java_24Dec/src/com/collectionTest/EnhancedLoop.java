package com.collectionTest;

import java.util.Random;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] values = new int[10];
    Random r = new Random();
    for(int i=0;i<values.length;i++)
    {
    values[i] =r.nextInt(999999	);

    }
    for(int n : values)
        System.out.println(n);

	}

}
