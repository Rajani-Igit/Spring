package com.dependson.annotations;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
@DependsOn("cache")
@Component("cacheManager")
public class CacheManager {
  public CacheManager(){
	  
	  System.out.println("CacheManager");
  }
}
