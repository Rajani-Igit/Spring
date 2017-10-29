package com.afteradvice.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
/*
 * Controll points:-
 * this method executes afte the target method execution completes just before returning the return value to the calee
 * 1.We can  see the  return value but can not change
 * 2. We can see the parameter but can not change the parameters 
 * 3. We can not controll the target method but we can stop by throwing an exception
 * 
 * */
public class KeyvalidatorAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method method, Object[] args, Object target) throws Throwable {
		if((Integer)ret==0){
			throw new IllegalArgumentException("Low security key");
		}
		

		
	}

}
