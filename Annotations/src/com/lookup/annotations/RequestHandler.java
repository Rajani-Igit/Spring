package com.lookup.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class RequestHandler {
	
	public RequestHandler(){
		
		System.out.println("request handler");
	}
	
	@Value("Http request")
	private String requesttype;
	
	

}
