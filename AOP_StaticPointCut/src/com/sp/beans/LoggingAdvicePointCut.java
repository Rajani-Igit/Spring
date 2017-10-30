package com.sp.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LoggingAdvicePointCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clzz) {
		System.out.println("Inside point cut before if");
		if(clzz.isAssignableFrom(Calculator.class)&& method.getName().equals("add"))
		{
			System.out.println("Inside point cut");
			return true;
		}
			return false;
	}

}
