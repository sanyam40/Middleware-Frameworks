package com.ncu.Practice_Unit1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
    	
    	/*
    	 --> METHOD 2 : USING ANNOTATION BASED CONFIGURATION
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
    	
    	DegreeClass bd=context.getBean("calc",DegreeClass.class);
    	System.out.println("Hello Sanyam");
    	bd.cgpa("ECE");
    	context.close(); */
    	
    	// --> METHOD 3 : USING JAVA BASED CONFIGURATION
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
    	
    	DegreeClass bd=context.getBean("Degree",DegreeClass.class);
    	System.out.println("Hello Sanyam");
    	bd.cgpa("ECE");
    	context.close();
    }
}
