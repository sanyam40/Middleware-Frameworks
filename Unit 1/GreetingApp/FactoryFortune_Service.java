package com.ncu.GreetingApp;
public class FactoryFortune_Service {
	
	public Fortune_Teller Fortune(String lang) {
		if(lang.equals("eng")) {
			return new English_Fortune();
		}/*else if(lang.equals("fre")) {
			return new FrenchGreeting_Service();
		}else if(lang.equals("spa")) {
			return new SpanishGreeting_Service();
		}*/else {
			throw new RuntimeException("Sorry, "+lang+" language is not available!!");
		}
	}

}
