package com.basic.java;

public class DataTypes {

	byte b; // 1 byte
	short s; // 2 bytes
	int i; // 4 bytes
	long l;// 8 bytes

	float f; // 4 bytes
	double d;// 8 bytes

	boolean bl;
	char ch;

	String str;

	static String cname;

	public static void main(String[] args) {

		DataTypes dt = new DataTypes();

		System.out.println("Byte: " + dt.b);
		System.out.println("Short: " + dt.s);
		System.out.println("Int :" + dt.i);
		System.out.println("Long: " + dt.l);

		System.out.println("Float :" + dt.f);
		System.out.println("Double :" + dt.d);

		System.out.println("Boolean : " + dt.bl);
		System.out.println("Char : " + dt.ch);

		System.out.println("String : " + dt.str);

		System.out.println("static string :" + dt.cname); // static value null.

	}

}
