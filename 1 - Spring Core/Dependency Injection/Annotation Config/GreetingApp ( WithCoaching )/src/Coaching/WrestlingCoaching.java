package com.ncu.GreetingApp;

import org.springframework.stereotype.Component;

@Component
public class WrestlingCoaching implements Coaching_Teller{

	@Override
	public String tellCoaching() {
		// TODO Auto-generated method stub
		return "Do 100 Pushups Daily";
	}

}
