package com.ncu.GreetingApp;

public class SpanishGreeting_Service implements Greeting_Service{
	public void greet(String name) {
		System.out.println("Holaa, "+name);
	}

}
