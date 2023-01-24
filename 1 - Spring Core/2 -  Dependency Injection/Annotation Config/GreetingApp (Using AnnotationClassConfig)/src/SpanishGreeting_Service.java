package com.ncu.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreeting_Service implements Greeting_Service{
	
	//helper service
	private Fortune_Teller fortuneservice;
		
	// Injected the dependency object into the constructor of GreetingService
	@Autowired
	public SpanishGreeting_Service(@Qualifier("spanish_Fortune")Fortune_Teller fortuneservice) {
					this.fortuneservice=fortuneservice;
		}
	public void greet(String name) {
		System.out.println("Holaa, "+name);
	}
	
	public String getDFortune() {
		return fortuneservice.tellFortune();
	}
}
