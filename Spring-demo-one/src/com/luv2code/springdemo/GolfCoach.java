package com.luv2code.springdemo;

public class GolfCoach implements Coach {
 private FortuneService fortuneService;
 
 
	public GolfCoach(FortuneService fortuneService) {
	
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		return "Practice your putting skills for 2 days..";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
