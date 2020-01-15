package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	 */
	public TennisCoach()
	{
		System.out.println(">> Tennis Coach : inside default constructor..");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley..!!";
	}
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> tennis Coach : inside the doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
