package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
 	private FortuneService fortuneService;
	
//	@PostConstruct
	public void dosomething () {
		System.out.println("This is postconstruct");

	}
	public TennisCoach( ) {
		 
		System.out.println("This is inside the construction function");
	}

	
//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}
//
//
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
}
