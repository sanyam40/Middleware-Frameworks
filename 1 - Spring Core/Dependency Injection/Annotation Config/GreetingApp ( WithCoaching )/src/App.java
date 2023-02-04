// --> SANYAM 21CSU234 

package com.ncu.GreetingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	// --> SPRING CODE - ANNOTATION BASED 
    	
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
