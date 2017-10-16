package com.lookup.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext("com.lookup.annotations");
		Container container=context.getBean("abc",Container.class);
		Container container1=context.getBean("abc",Container.class);
	System.out.println(container==container1? "true":"false");
	System.out.println(container);
	System.out.println(container1);
	}

}
