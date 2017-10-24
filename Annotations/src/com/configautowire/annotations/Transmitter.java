package com.configautowire.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Transmitter {
    @Value("320Mhz")
	private String type;

	@Override
	public String toString() {
		return "Transmitter [type=" + type + "]";
	}
    
  
}
