// --> SANYAM 21CSU234 FS-IV-A

package com.ncu.Calculator;

import java.util.Scanner;

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
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.print("ENTER THE 1st no : ");
    	int x=sc.nextInt();
    	//System.out.println();
    	System.out.print("ENTER THE 2nd no : ");
    	int y=sc.nextInt();
    	System.out.println("1.ADD 2.SUB 3.MULTIPLY 4.DIVIDE");
    	int no=sc.nextInt();
    	String a="";
    	if(no==1) {
    		a="Add";
    	}
    	else if(no==2) {
    		a="Sub";
    	}
    	else if(no==3) {
    		a="Mul";
    	}
    	else if(no==4) {
    		a="Div";
    	}
    	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Calculator calc = context.getBean("Calc",Calculator.class);
    	calc.Compute(a, x, y);
    	context.close();
    }
}
