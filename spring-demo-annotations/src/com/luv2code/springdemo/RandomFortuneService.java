package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beaware of the wolf in the sheep's clothing",
			"Diligence is the mother of good luck",
			"The jonuary is the reward"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
