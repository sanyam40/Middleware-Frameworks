// --> SANYAM 21CSU234 

package com.ncu.GreetingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * ---> THIS IS TIGHT COPULING
		 * EnglishGreetingService eng = new EnglishGreetingService();
		 * eng.greet("Sanyam");
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
    	
    	/* FactoryGreetingService factory = new FactoryGreetingService();
    	Greeting_Service service = factory.greeting("fre");
    	
    	service.greet("Sanyam");
    	
    	FactoryFortune_Service factory2=new FactoryFortune_Service();
    	Fortune_Teller service2=factory2.Fortune("fre");
    	service2.tellFortune(); */
    	
    	// --> SPRING CODE - USING DEPENDENCY INJECTION - XML & ANNOTATION BASED 
    	
    	// Step 1 : Initialize the Spring Container
    	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
    			
    	// Step 2 : Get the Desired Bean
    	Greeting_Service service=context.getBean("frenchGreeting_Service",Greeting_Service.class);
    	
    	// Step 3 : perform the desired operation
    	//service.greet("TANYA");
    	service.greet("SANYAM");
    	
    	System.out.println(service.getDFortune());
    	service.getCoaching();
    	
    	// Step 4: Close 
    	context.close();
    }
}
