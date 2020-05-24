package com.basic.java;

public class MethodSignatureDemo {

	public void m1(int i) {
		System.out.println(i);
	}

	public void m1(float i) {
		System.out.println(i);
	}

	public void m2(String str) {
		System.out.println(str);
	}

	public void m3(Integer i) {
		System.out.println(i);
	}

	public void m4(Object o) // take any argument
	{
		System.out.println(o);
	}
	
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,float j )
	{
		System.out.println(i+j);
	}

	public static void main(String[] args) {

		MethodSignatureDemo obj = new MethodSignatureDemo();
		obj.m1(20);
		obj.m1(23.22f);
		obj.m2("Harshal");
		obj.m3(2);
		obj.m4("Jhankar");

	}

}
