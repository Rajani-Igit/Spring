package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public Object log(ProceedingJoinPoint pjp) throws Throwable{
		String methodName=pjp.getSignature().getName();
		Object[]args=pjp.getArgs();
		args[0]=100;
		args[1]=200;
	System.out.println(" logging method "+methodName);
		Object ret=pjp.proceed(args);
		System.out.println("exiting logging method "+methodName);
	return ret;
	}

}
