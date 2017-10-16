package com.propertysource.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RobotTest {

	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext("com.propertysource.annotations");
	Robot robot=context.getBean("robot",Robot.class);
	System.out.println(robot);
	}

}
