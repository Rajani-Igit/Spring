package com.sp.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodinvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Looging  Method name :"+methodinvocation.getMethod().getName());
		Object ret=methodinvocation.proceed();
		System.out.println("Logging Return Value "+ ret);
		return ret;
	}

}
