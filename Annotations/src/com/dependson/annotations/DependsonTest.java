package com.dependson.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context=new AnnotationConfigApplicationContext("com.dependson.annotations");
	
	}

}
