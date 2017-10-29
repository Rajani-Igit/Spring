/**
 * 
 */
package com.badvice.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Rajanikanta Pradhan
 * Controll points:
 * 1. We can See and modify the parameters  and the modified params effectd in target class method
 * 2. We can not have controll on target method but we camn suspend by throwing an exception  
 * 3. After executing crossscutting logic the controll goes to target method and does not return to again aspect class
 * 4. so the method return type is void, so we can not see the return value in aspect class.
 * 
 */
public class AuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(args[0]+" "+args[1]);
		System.out.println("Method name"+method.getName());
		
	}

}
