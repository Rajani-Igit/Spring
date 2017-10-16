package com.value.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\value\\annotations\\value-context.xml");
       Robot robot=context.getBean("robot",Robot.class);
       System.out.println(robot);
	}

}
