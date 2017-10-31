package com.dp.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.dp.beans.Calculator;
import com.dp.beans.DynamicLoggingPointCut;
import com.dp.beans.LoggingAdvice;

public class DynamicPointcutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyFactory factory= new ProxyFactory();
		factory.setTarget(new Calculator());
		factory.addAdvisor(new DefaultPointcutAdvisor(new DynamicLoggingPointCut(),new LoggingAdvice()));
Calculator proxy=(Calculator)factory.getProxy();
System.out.println(proxy.add(120, 120));
System.out.println(proxy.substract(200, 100));
	}

}
