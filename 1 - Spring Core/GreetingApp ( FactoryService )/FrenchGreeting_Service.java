package com.ncu.GreetingApp;

public class FrenchGreeting_Service implements Greeting_Service{
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}

}
