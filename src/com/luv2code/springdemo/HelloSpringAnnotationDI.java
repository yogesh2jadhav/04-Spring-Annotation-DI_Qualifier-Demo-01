package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAnnotationDI {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext CPXApplicationContext = new ClassPathXmlApplicationContext("applicationContext-springAnnotation-DI.xml");
		Coach myCoach = CPXApplicationContext.getBean("khoKhoCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		// This DI with @Autowired Called Constructor Injection.
		System.out.println(myCoach.getYourFourtune());
		
		// This DI with @Autowired Called Setter Injection.
		System.out.println(myCoach.getTodaysTip());
		
		// This DI with @Autowired called Method Injection
		System.out.println(myCoach.getTodaysGamePlan());
		
		// This DI with @Autowired called field Injection
		System.out.println(myCoach.getTimeTable());
	}

}
