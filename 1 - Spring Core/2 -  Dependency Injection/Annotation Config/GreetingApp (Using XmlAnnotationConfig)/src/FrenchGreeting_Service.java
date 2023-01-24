package com.ncu.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreeting_Service implements Greeting_Service{
	
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}
}
