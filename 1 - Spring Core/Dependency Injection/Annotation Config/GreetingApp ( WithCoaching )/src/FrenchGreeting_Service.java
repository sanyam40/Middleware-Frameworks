package com.ncu.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreeting_Service implements Greeting_Service{
	
	 // helper service
	private Fortune_Teller fortuneservice;
	private Coaching_Teller coachingteller;
	
	// Injected the dependency object into the constructor of GreetingService
	@Autowired
	public FrenchGreeting_Service(@Qualifier("french_Fortune")Fortune_Teller fortuneservice,@Qualifier("cricketCoaching")Coaching_Teller coachingteller) {
			this.fortuneservice=fortuneservice;
			this.coachingteller=coachingteller;
	}
	
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}
	
	public String getDFortune() {
		return fortuneservice.tellFortune();
	}
	
	public void getCoaching() {
		System.out.println(coachingteller.tellCoaching());
	}

}
