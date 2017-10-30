package com.aop.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aop.util.Cache;


public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = methodInvocation.getMethod().getName();
		Object[] args = methodInvocation.getArguments();
		String key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key = key + args[i];
				continue;
			} 
				key = "," + args[i];
			

		}
		key = key + ")";
Cache cache=Cache.getInstance();
if(cache.containskey(key)){
	return cache.get(key);
}
Object ret=methodInvocation.proceed();
cache.put(key, ret);
		return ret;
	}

}
