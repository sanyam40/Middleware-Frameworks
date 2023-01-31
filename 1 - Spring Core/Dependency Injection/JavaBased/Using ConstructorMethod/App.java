// --> SANYAM 21CSU234 FS-IV-A
// DATE : 31/01/23

package com.ncu.Calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CalculatorConfig.class);
    	
    	CalculatorClass calc = context.getBean("calc",CalculatorClass.class);
    	calc.Compute("Add", 3, 4);
    	context.close();
    }
}
