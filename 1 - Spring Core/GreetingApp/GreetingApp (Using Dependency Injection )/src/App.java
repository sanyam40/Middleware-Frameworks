// --> SANYAM 21CSU234 

package com.ncu.GreetingApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	// --> SPRING CODE - Dependency Injection
    	
    	// Step 1 : Initialize the Spring Container
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    			
    	// Step 2 : Get the Desired Bean
    	Greeting_Service service=context.getBean("spanishGreeting",Greeting_Service.class);
    	
    	// Step 3 : perform the desired operation
    	service.greet("SANYAM");
    	
    	System.out.println(service.getDFortune());
    	
    	// Step 4: Close 
    	context.close();
    }
}
