package com.basic.java;

public class Calculations {
	
	int a,b,c;
	
	public Calculations(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	
	public Calculations()
	{
		System.out.println("Default constructor");
	}
	public void add()
	{
		c = a +b;
		System.out.println("Addition of a and b is " +c);
	}
	public void sub()
	{
		c = a-b;
		System.out.println("Substraction of a and b is " +c);
	}
	
	
	public static void main(String[] args) {
		
		Calculations c1= new Calculations();
		c1.add();
		c1.sub();
		
		Calculations c2 = new Calculations(30,20);
		c2.add();
		c2.sub();
		
	}

}
