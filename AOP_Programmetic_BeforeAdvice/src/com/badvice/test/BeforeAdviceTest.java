package com.badvice.test;

import org.springframework.aop.framework.ProxyFactory;

import com.badvice.beans.AuditingAdvice;
import com.badvice.beans.LoanManager;

public class BeforeAdviceTest {

	public static void main(String[] args) {
 ProxyFactory factory= new ProxyFactory();
 AuditingAdvice advice= new AuditingAdvice();
 LoanManager target=new LoanManager();
 factory.setTarget(target);
 factory.addAdvice(advice);
 LoanManager loanmanager=(LoanManager)factory.getProxy();
 loanmanager.approveLoan("L123df", "Manager");
	
	}

}
