package com.ncu.GreetingApp;

public class EnglishGreeting_Service implements Greeting_Service{

	@Override
	public void greet(String name) {
			System.out.println("Hello, "+name);
		}
		
	}
