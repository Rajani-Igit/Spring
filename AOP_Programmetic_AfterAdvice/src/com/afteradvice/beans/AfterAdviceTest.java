package com.afteradvice.beans;

import org.springframework.aop.framework.ProxyFactory;

public class AfterAdviceTest {

	public static void main(String[] args) {
      ProxyFactory factory=new ProxyFactory();
      KeyGenerator target= new KeyGenerator();
      KeyvalidatorAdvice advice=new KeyvalidatorAdvice();
      factory.addAdvice(advice);
      factory.setTarget(target);
      KeyGenerator proxy=(KeyGenerator)factory.getProxy();
    System.out.println(proxy.generateKey("23456yhhb"));
	}

}
