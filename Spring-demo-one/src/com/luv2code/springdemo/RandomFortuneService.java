package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
 private String[] data= {"BasketBall", "Cricket", "Table Tennis"};
 private Random random = new Random();
 
	@Override
	public String getFortune() {
		int num= random.nextInt(data.length);
		return data[num];
	}

}
