package com.configautowire.annotations;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan({"com.configautowire.annotations"})
@Configuration
public class JavaConfig {
/*
	@Bean(name="javatransmitter")
	public Transmitter transmitter(){
		
		return new Transmitter();
	}*/
	@Bean(name="radio",autowire=Autowire.BY_TYPE)
	public Radio radio(){
		
		return new Radio();
	}
}
