package com.dp.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("Inside invoke() Logging method "+methodInvocation.getMethod().getName() );
		Object ret=methodInvocation.proceed();
		System.out.println("Inside invoke() exiting ");
		return ret;
	}

}
