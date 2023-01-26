// --> SANYAM 21CSU234 FS-IV-A

package com.ncu.Calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ){	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
    	
    	CalculatorClass calc = context.getBean("calculatorClass",CalculatorClass.class);
    	calc.Compute("Add", 3, 4);
    	context.close();
    }
}
