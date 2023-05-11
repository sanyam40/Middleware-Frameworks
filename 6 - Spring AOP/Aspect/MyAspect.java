package com.Spring.SpringAOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(* com.Spring.SpringAOP.Service.PaymentServiceImpl.makePayment(..))")
	public void forPayment() {}
	
	@Before("forPayment()")
	public void printBefore() {
		System.out.println("Payment Started ----@Before----.");
	}
	
	@AfterReturning("forPayment()")
	public void printAfter_returning() {
		System.out.println("Payment Done ----@AfterReturning----");
	}
	
	@After("forPayment()")
	public void printAfter() {
		System.out.println("METHOD EXECUTED ----@After----");
	}
	
	@AfterThrowing("forPayment()")
	public void printAfter_throwing() {
		System.out.println("THROWING AN EXECPTION ----@AfterThrowing----");
	}
	
	@Around(value = "execution(* com.Spring.SpringAOP.Service.PaymentServiceImpl.makePayment())")
	public Object printaround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("----@Around----");
		System.out.println("Before method initiated");
		Object value = pjp.proceed();
		System.out.println("executed sucessfully(@around annotation)");
		return value;
		
	}
}