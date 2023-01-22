package com.ncu.GreetingApp;

public class FactoryGreetingService {
	public Greeting_Service greeting(String lang) {
		if(lang.equals("eng")) {
			return new EnglishGreeting_Service();
		}else if(lang.equals("fre")) {
			return new FrenchGreeting_Service();
		}else if(lang.equals("spa")) {
			return new SpanishGreeting_Service();
		}else {
			throw new RuntimeException("Sorry, "+lang+" language is not available!!");
		}
	}

}
