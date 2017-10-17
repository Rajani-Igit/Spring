package com.configure.annotations;

import org.springframework.beans.factory.annotation.Value;

public class Robot { 
	@Value("324")
	private int id;
	@Value("android")
	private String type;
	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + "]";
	}
	
	
	

}
