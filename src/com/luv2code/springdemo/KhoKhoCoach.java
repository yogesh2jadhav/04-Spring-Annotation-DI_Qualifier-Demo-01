package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KhoKhoCoach implements Coach {
	
	// This DI with @Autowired called Field Injection.
	@Autowired
	@Qualifier("happyFourtuneService") // We can use happyFourtuneService or randomFourtuneService.
	FourtuneService _happyFourtuneService;
	GameTips _todaysTip;
	GamePlanService _happyGamePlan;
	
	TodaysTimeTable _TimeTable;
	
	// This DI with @Autowired called Constructor Injection.
	@Autowired
	public KhoKhoCoach(TodaysTimeTable theTimeTable) {
		super();
		this._TimeTable = theTimeTable;
	}
	
	
	// This DI with @Autowired called Setter Injection.
	@Autowired
	public void set_todaysTip(TodaysTips _todaysTip) {
		this._todaysTip = _todaysTip;
	}

	// This DI with @Autowired called Method Injection.
	@Autowired
	public void dingDong(HappyGamePlan happyGamePlan) {
		
		System.out.println("Because @Autowired Spring freamwork have called dingDong Method automatically.");
		_happyGamePlan=happyGamePlan;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play langdi for 30 min and 10 rounds around the poll";
	}

	@Override
	public String getYourFourtune() {
		// TODO Auto-generated method stub
		return _happyFourtuneService.getYourFourtune();
	}


	@Override
	public String getTodaysTip() {
		// TODO Auto-generated method stub
		return _todaysTip.getTipsForToday();
	}


	@Override
	public String getTodaysGamePlan() {
		// TODO Auto-generated method stub
		return _happyGamePlan.getGamePlan();
	}


	@Override
	public String getTimeTable() {
		// TODO Auto-generated method stub
		return _TimeTable.getTimeTable();
	}

}
