package com.javaconfigprimitive.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com//javaconfigprimitive//annotations//radio.properties")
public class JavaConfig {
@Autowired
Environment env;
	@Bean(name="radio")
	public Radio newRadio(){
		Radio radio=new Radio();
		radio.setId(env.getProperty("radio_id"));
		radio.setType(env.getProperty("radio_type"));
		return radio;
	}
}
