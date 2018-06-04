package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyGamePlan implements GamePlanService {

	@Override
	public String getGamePlan() {
		// TODO Auto-generated method stub
		return "Today's Game Plan - Is we will play in Attack Mode";
	}

}
