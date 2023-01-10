package com.ncu.GreetingApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * ---> THIS IS TIGHT COPULING
		 * EnglishGreetingService eng = new EnglishGreetingService();
		 * eng.greet("Sumit");
		 * 
		 * FrenchGreetingService fre = new FrenchGreetingService(); fre.greet("Sanyam");
		 * 
		 * SpanishGreetingService spa = new SpanishGreetingService();
		 * spa.greet("Sanyam");
		 */
    	
    	// --> THIS IS LOSE COPULING
    	/*Scanner sc=new Scanner(System.in);
    	System.out.print("ENTER THE NAME : ");
    	String name=sc.next();*/
    	
    	FactoryGreetingService factory = new FactoryGreetingService();
    	Greeting_Service service = factory.greeting("eng");
    	
    	service.greet("Sanyam");
    	
    	FactoryFortune_Service factory2=new FactoryFortune_Service();
    	Fortune_Teller service2=factory2.Fortune("eng");
    	service2.tellFortune();
    }
}
