package com.ncu.GreetingApp;

import org.springframework.stereotype.Component;

@Component 
public class BasketBallCoaching implements Coaching_Teller{

	@Override
	public String tellCoaching() {
		// TODO Auto-generated method stub
		return "Running 10 km & 50 pushups";
		
	}

}
