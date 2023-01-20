package com.ncu.Calculator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculator {
	public void Compute(String operation, int x, int y) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		if(operation=="Add") {
	    	MathService service=context.getBean("Add",MathService.class);
	    	service.operate(x,y);
		}
		else if(operation=="sub") {
	    	MathService service=context.getBean("Sub",MathService.class);
	    	service.operate(x,y);
		}
        else if(operation=="mul") {
	    	MathService service=context.getBean("Mul",MathService.class);
	    	service.operate(x,y);
		}
        else if(operation=="div") {
	    	MathService service=context.getBean("Div",MathService.class);
	    	service.operate(x,y);
		}
        else {
			throw new RuntimeException("Sorry, "+operation+" operation is not available!!");
		}
		
		
	}
}
