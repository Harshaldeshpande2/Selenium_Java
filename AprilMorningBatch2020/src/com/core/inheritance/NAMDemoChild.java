package com.core.inheritance;

public class NAMDemoChild extends NAMDemoParent {

	public void m2()
	{
		System.out.println("I am in m2 method of class Child");
	}
	
	public static void main(String[] args) {
		
		NAMDemoChild nm = new NAMDemoChild();
		nm.m1();
		nm.m2();
		
		
	}
}
