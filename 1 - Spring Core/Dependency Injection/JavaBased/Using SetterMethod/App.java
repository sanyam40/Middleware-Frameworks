package com.ncu.CalculatorAppT;
 
import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncu.GreetingApp.ConfigAnnotation;

//import com.ncu.GreetingApp.Greeting_Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	Scanner No=new Scanner(System.in);
    	
    	System.out.println("Enter your first number : ");
    	int x=No.nextInt();
    	
    	System.out.println("Enter your second number : ");
    	int y=No.nextInt();
    	
    	//XML Annotation
    	//ClassPathXmlApplicationContext ope=new ClassPathXmlApplicationContext("Operations.xml");
    	
    	//Annotation
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CalculatorConfig.class); 
    	
    	Calculator service=context.getBean("calc", Calculator.class);
    	
    	service.compute(x, y, "Add");
		service.compute(x, y, "Subtract"); 
		service.compute(x, y, "Devide");
		service.compute(x, y, "Multiply");
		 
    	
       	//service.operate(x, y);

    }
    	/*Scanner No=new Scanner(System.in);
    	System.out.println("Choose :");
    	System.out.println("1. Addition  2. Subtraction   3.Multiplication    4. Division  -  ");
    	int m=No.nextInt();
    	
    	System.out.println("Enter your first number : ");
    	int x=No.nextInt();
    	
    	System.out.println("Enter your second number : ");
    	int y=No.nextInt();
    	
    	String a="";
    	switch(m) {
    	  case 1:
    		  a="Addition";
    	    break;
    	    
    	  case 2:
    		  a="Subtraction";
    	    break;
    	    
    	  case 3:
    		  a="Multiplication";
    	    break;
    	    
    	  case 4:
    		  a="Division";
    	    break;
    		  
    	  default:
    	}
    	
    	
    	
    	// Step 1 : Initialize the Spring Container
    	ClassPathXmlApplicationContext ope=new ClassPathXmlApplicationContext("Operations.xml");
    			
    	// Step 2 : Get the Desired Bean
    	MathService service=ope.getBean(a,MathService.class);
    	
    	// Step 3 : 
    	service.operate(x, y);
    }*/
    	
    	
}
