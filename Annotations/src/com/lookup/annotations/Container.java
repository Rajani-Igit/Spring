package com.lookup.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abc")
public class Container {
	/*@Autowired
	RequestHandler handler;*/
public Container(){
	System.out.println("Container");
	
}

@Lookup
public RequestHandler gethandler(){
	return null;
}
	@Override
	public String toString() {
		return "Container [handler=" + gethandler() + "]";
	}
	

}
