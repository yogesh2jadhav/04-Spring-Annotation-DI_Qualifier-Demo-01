package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFourtuneService implements FourtuneService {

	private String[] data = {
			"Today is your supper lucky Day!!!",
			"You will Lottry today!!!",
			"Be care full Today!!!"
	};
	
	public Random myRandom = new Random();
	
	@Override
	public String getYourFourtune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String str = data[index];
		return str;
	}

}
