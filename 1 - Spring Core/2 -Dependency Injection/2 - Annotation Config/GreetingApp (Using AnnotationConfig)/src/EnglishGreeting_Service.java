package com.ncu.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreeting_Service implements Greeting_Service{

	// Dependency of GreetingApp
	 // helper service
	private Fortune_Teller fortuneservice;
	
	// Injected the dependency object into the constructor of GreetingService
	@Autowired
	public EnglishGreeting_Service(@Qualifier("english_Fortune") Fortune_Teller fortuneservice) {
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
