package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}




	public String getTeam() {
		return team;
	}




	public void setEmailAddress(String emailAddress) {
		System.out.println("This is inside cricketCoach setter email");

		this.emailAddress = emailAddress;
	}




	public void setTeam(String team) {
		System.out.println("This is inside cricketCoach setter team");

		this.team = team;
	}




	public CricketCoach() {
		System.out.println("This is inside cricketCoach no-arg copnstructor");
	}
	
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("This is inside cricketCoach setter Method");

		this.fortuneService = fortuneService;
	}




	public CricketCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice 15 mins a day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
