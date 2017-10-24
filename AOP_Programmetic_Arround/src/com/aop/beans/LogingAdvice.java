package com.aop.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String methodName=methodInvocation.getMethod().getName();
        Object[]args=methodInvocation.getArguments();
        if(methodName.equalsIgnoreCase("add")){
        System.out.println(args[0]+" "+args[1]);
        }
        Object ret=methodInvocation.proceed();
        
        if(methodName.equalsIgnoreCase("add")){
        	 System.out.println(ret);    
        }
       
		return ret;
	}

}
