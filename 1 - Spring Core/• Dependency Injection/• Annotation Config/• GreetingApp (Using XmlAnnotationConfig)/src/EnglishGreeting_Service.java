package com.ncu.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreeting_Service implements Greeting_Service{
	
	@Override
	public void greet(String name) {
			System.out.println("Hello, "+name);
		}
}
