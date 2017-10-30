package com.sp.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.sp.beans.Calculator;
import com.sp.beans.LoggingAdvice;
import com.sp.beans.LoggingAdvicePointCut;

public class StaticPointcutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProxyFactory factory=new ProxyFactory();
		Calculator target=new Calculator();
		factory.setTarget(target);
		
		factory.addAdvisor(new DefaultPointcutAdvisor(new LoggingAdvicePointCut(),new LoggingAdvice()));
		Calculator proxy=(Calculator)factory.getProxy();
		//proxy.add(5, 7);
		//proxy.multiply(10, 20);
	}

}
