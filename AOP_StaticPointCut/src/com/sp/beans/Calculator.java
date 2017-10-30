package com.sp.beans;

public class Calculator {
	public int add(int a, int b){
		System.out.println("Executing Add method in add method");
		return a+b;
	}
	public int multiply(int a,int b){
		System.out.println("Executing Multiply method");
		return a*b;
	}

}
