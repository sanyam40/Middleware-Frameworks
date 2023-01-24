package com.ncu.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreeting_Service implements Greeting_Service{
	
	 // helper service
	private Fortune_Teller fortuneservice;
	
	// Injected the dependency object into the constructor of GreetingService
	@Autowired
	public FrenchGreeting_Service(@Qualifier("french_Fortune")Fortune_Teller fortuneservice) {
			this.fortuneservice=fortuneservice;
	}
	
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}
	
	public String getDFortune() {
		return fortuneservice.tellFortune();
	}
}
