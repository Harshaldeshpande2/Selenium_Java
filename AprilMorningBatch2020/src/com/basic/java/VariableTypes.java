package com.basic.java;

public class VariableTypes {

	int x = 100; // instance/non static/global variable

	static String cName = "TCS"; // static variable

	static VariableTypes obj;
	
	public void m1() {
		int y = 10; // local variable
		int x = 10;
		System.out.println(y);
		System.out.println(this.x);
		System.out.println(x);
		System.out.println(cName);
	}

	public static void m2() // static method

	{
		obj = new VariableTypes();
		VariableTypes v2 = new VariableTypes();
		System.out.println(v2.x); // with object
		System.out.println(VariableTypes.cName); // with classname
		System.out.println(cName); // directly

	}
	
	
	
	int a = 10;
	static int b = 20;
	
	public void instance_method()
	{
		System.out.println("Inside instance method");
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void static_method()
	{
		System.out.println("Inside static method");
		VariableTypes v1 = new VariableTypes();
		System.out.println(v1.a);
		System.out.println(b);
		System.out.println(VariableTypes.b);
	}

	int c = 10;
		public void local()
		{
			int c = 1;
		System.out.println(this.c);
		}
	
	
	public static void main(String[] args) {

		VariableTypes v1 = new VariableTypes();
		System.out.println(v1.x);
		System.out.println(VariableTypes.cName);
		System.out.println(cName);

		v1.instance_method();
		static_method();
		v1.local();
		
	}
}
