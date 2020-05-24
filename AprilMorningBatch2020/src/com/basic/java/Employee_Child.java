package com.basic.java;

public class Employee_Child extends Employee {
	
	String address;

	public Employee_Child(String address) {
		super(4,"jb",23.43f);
		this.address = address;

		System.out.println(this.address);
	
	}

	public static void main(String[] args) {
		
		Employee_Child ec = new Employee_Child("Hyderabad");
		
	}
}
