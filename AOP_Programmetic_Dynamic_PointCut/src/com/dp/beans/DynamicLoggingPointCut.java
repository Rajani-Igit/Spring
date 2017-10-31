package com.dp.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class DynamicLoggingPointCut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clzz, Object... args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Matches");
		if(clzz.isAssignableFrom(Calculator.class)&& method.getName().equals("add")&&(Integer)args[0]>100&&(Integer)args[1]>100){
			return true;
		}
		return false;
	}

}
