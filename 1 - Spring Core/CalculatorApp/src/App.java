// --> SANYAM 21CSU234 FS-IV-A

package com.ncu.Calculator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        /*
         --> USING COUPLING
        Calculator cal=new Calculator();
        MathService service=cal.Compute("mul");
        service.operate(2,4);*/
    	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	MathService service=context.getBean("Add",AdditionService.class);
    	
    	service.operate(2,3);
    	context.close();
        
    }
}
