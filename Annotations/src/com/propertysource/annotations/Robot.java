package com.propertysource.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:com/propertysource/annotations/robott.properties")
public class Robot {
@Value("${robotid}")	
private String id;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

@Override
public String toString() {
	return "Robot [id=" + id +"]";
}


}
