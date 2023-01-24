// --> SANYAM 21CSU234 FS-IV-A

package com.ncu.Calculator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("operations.xml");
    	
    	CalculatorClass calc = context.getBean("oper",CalculatorClass.class);
    	calc.Compute("Add", 3, 4);
    	context.close();
    }
}
