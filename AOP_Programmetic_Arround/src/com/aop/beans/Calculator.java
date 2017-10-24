package com.aop.beans;

public class Calculator {
	public int add(int i,int j){
		System.out.println("Add method");
		return i+j;
	}

	public int sub(int i,int j){
		System.out.println("Substract method");
		return i-j;
	}
}
