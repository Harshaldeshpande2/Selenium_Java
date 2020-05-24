package com.core.inheritance;

import java.util.Date;

public class NAMDemoParent {

	public int x = 100;

	public final int y = 100;

	public final void m1() {

		System.out.println("I am m1 method in class Parent");
	}

	public static void m4() {
		System.out.println("I am in static method of parent class");
	}

	static // static block
	{
		Date d = new Date();
		System.out.println(d); // system date...will be executed first
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		NAMDemoParent np = new NAMDemoParent(); // cant instantiate the object
		NAMDemoParent.m4();

	}

}
