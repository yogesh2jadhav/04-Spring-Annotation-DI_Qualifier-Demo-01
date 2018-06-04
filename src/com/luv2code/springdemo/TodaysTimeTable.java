package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TodaysTimeTable implements TimeTable {

	@Override
	public String getTimeTable() {
		// TODO Auto-generated method stub
		return "We have 3 matches today Morning, Afternoon and night";
	}

}
