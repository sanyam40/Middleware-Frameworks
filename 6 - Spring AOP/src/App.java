

package com.Spring.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.SpringAOP.Service.PaymentService;

public class App {
    public static void main( String[] args ){
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/SpringAOP/Config.xml");
    	
    	PaymentService service=context.getBean("payment",PaymentService.class);
    	
    	service.makePayment();
        
    }
}
