package com.ncu.GreetingApp;

public class EnglishGreeting_Service implements Greeting_Service{

	// helper service
	private Fortune_Teller fortuneservice;
	
	// Injected the dependency object into the constructor of GreetingService
	public EnglishGreeting_Service(Fortune_Teller fortuneservice) {
		this.fortuneservice=fortuneservice;
	}
	@Override
	public void greet(String name) {
			System.out.println("Hello, "+name);
		}
	
	public String getDFortune() {
		return fortuneservice.tellFortune();
	}
		
	}
