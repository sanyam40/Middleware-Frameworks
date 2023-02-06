package com.ncu.Practice_Unit1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
    	
    	// --> USING ANNOTATION BASED CONFIGURATION
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
    	
    	DegreeClass bd=context.getBean("degreeClass",DegreeClass.class);
    	System.out.println("Hello Sanyam");
    	bd.cgpa("ECE");
    	context.close();
    }
}
