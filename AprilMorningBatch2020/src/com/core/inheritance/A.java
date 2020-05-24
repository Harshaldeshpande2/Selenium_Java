package com.core.inheritance;

public class A {
	
	public int x = 100;

	public void m1()
	{
		System.out.println("I am in m1 method of class A");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.m1();
		System.out.println(a.x);
		
	}

}
