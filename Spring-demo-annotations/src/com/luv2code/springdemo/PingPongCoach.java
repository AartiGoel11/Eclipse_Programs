package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

//	public PingPongCoach()
//	{
//		System.out.println("Default constructor of ping pong coach");
//	}
	@Override
	public String getDailyWorkout() {
		return "Inside the getDailyWorkout method of PingPong class";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
