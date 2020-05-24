package com.icici.loans.personal;

import com.core.inheritance.A;
import com.core.inheritance.B;


public class C extends B {

	public void m3() {
		System.out.println("I am in m3 method of class C");
	}

	public static void main(String[] args) {

		C c = new C(); // has a relationship
		c.m1();		//can be accessed using child reference
		System.out.println(c.x);
		
		B b = new B();
		//b.m1(); //not access using parent reference protected method in another package
		System.out.println(b.x); //not accessed with parent reference.
		
		
	}

}
