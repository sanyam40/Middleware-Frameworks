package com.ncu.GreetingApp;

public class SpanishGreeting_Service implements Greeting_Service{
	
	// helper service
	private Fortune_Teller fortuneservice;
		
	// Injected the dependency object into the constructor of GreetingService
	public SpanishGreeting_Service(Fortune_Teller fortuneservice) {
					this.fortuneservice=fortuneservice;
				}
	public void greet(String name) {
		System.out.println("Holaa, "+name);
	}
	
	public String getDFortune() {
		return fortuneservice.tellFortune();
	}

}
