package com.ncu.GreetingApp;

public class FrenchGreeting_Service implements Greeting_Service{
	
	// helper service
	private Fortune_Teller fortuneservice;
	
	// Injected the dependency object into the constructor of GreetingService
	public FrenchGreeting_Service(Fortune_Teller fortuneservice) {
			this.fortuneservice=fortuneservice;
	}
	
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}
	
	public String getDFortune() {
		return fortuneservice.tellFortune();
	}

}
