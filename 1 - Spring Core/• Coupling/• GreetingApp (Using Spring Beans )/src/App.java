// --> SANYAM 21CSU234 

package com.ncu.GreetingApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	// --> SPRING CODE - Using Beans
    	
    	// Step 1 : Initialize the Spring Container
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    			
    	// Step 2 : Get the Desired Bean
    	Greeting_Service service=context.getBean("engGreeting",Greeting_Service.class);
    	Fortune_Teller fortune=context.getBean("engFortune",Fortune_Teller.class);
    	
    	// Step 3 : perform the desired operation
    	//service.greet("TANYA");
    	service.greet("SANYAM");
    	fortune.tellFortune();
    	
    	// Step 4: Close 
    	context.close();
    }
}
