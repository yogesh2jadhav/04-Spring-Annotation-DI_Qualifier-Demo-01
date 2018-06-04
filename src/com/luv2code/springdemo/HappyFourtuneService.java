package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFourtuneService implements FourtuneService {

	@Override
	public String getYourFourtune() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Day!!!";
	}

}
