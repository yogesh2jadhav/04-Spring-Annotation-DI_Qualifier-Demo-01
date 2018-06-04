package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TodaysTips implements GameTips {

	@Override
	public String getTipsForToday() {
		// TODO Auto-generated method stub
		return "Today's Tip is - Play happily you will Win!!";
	}

}
