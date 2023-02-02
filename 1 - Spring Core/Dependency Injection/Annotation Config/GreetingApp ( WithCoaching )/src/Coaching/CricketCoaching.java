package com.ncu.GreetingApp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoaching implements Coaching_Teller{

	@Override
	public String tellCoaching() {
		// TODO Auto-generated method stub
		return "Run for 5km daily";
		
	}

}
