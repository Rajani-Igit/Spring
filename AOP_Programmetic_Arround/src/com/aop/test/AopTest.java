package com.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.beans.Calculator;
import com.aop.beans.LogingAdvice;

public class AopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyFactory factory=new ProxyFactory();
		LogingAdvice advice=new LogingAdvice();
		Calculator target=new Calculator();
		CacheAdvice cacheadvice=new CacheAdvice();
		factory.addAdvice(cacheadvice);
		factory.addAdvice(advice);
		factory.setTarget(target);
		Calculator cal=(Calculator)factory.getProxy();
		System.out.println(cal.add(20, 5));
		System.out.println(cal.add(20, 5));
		System.out.println("Testing");
	}

}
