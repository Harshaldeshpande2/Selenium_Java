package com.hdfc.loans.homeloans;

public class Child extends D{

	public static void main(String[] args) {
		
		Child c1= new Child();
		c1.a1();
		c1.m1();

	}

	@Override
	public void a1() {

		System.out.println("I am overriden method of D class");
		
	}

}
