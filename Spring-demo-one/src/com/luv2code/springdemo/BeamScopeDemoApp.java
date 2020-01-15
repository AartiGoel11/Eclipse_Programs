package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeamScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
	 Coach theCoach = context.getBean("myCoach",Coach.class);
	 Coach alphaCoach = context.getBean("myCoach",Coach.class);
	 boolean result = (theCoach==alphaCoach);
	 System.out.println("result..."+result);
	 System.out.println("\nMemory location for the theCoach.."+theCoach);
	 System.out.println("\nMemory location for alphaCoach.."+alphaCoach);
	 context.close();
	}

}
