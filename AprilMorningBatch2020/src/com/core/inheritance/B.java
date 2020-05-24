package com.core.inheritance;

public class B extends A{

	
	public void m2()
	{
		System.out.println("I am in m2 method of class B");
	}
	
	public static void main(String[] args) {
	
		
		A a = new A(); //has a relationship
		a.m1();
		System.out.println(a.x);
	
		B b = new B();
		b.m2();
		b.m1();
		System.out.println(b.x);
		
	}

}
