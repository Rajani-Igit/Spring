package com.configure.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean(name="robot1") //Bydefault the bean id is method name if you not explicitly providing bean name
	@Scope("prototype")
	@Lazy
	public Robot robot(){
		
		return new Robot();
	}

}
