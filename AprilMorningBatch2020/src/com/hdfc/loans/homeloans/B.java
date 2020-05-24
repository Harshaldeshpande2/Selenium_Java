package com.hdfc.loans.homeloans;

public class B extends A{

	public void m2() {
		System.out.println("I am in m2 method of class B");
	}

	public static void main(String[] args) {
		
		B b = new B();
		b.m2();
		b.m1(); //accessing method of parent class.
	}
}
