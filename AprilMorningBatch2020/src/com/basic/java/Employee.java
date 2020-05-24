package com.basic.java;

public class Employee {

	int eno;
	String ename;
	float sal;

	public Employee() {
		System.out.println("I am in default constructor");
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}

	
	  public Employee(int eno) { this();
	  System.out.println("I am in 1 parameter constructor");
	  
	  this.eno = eno;
	  
	  System.out.println(this.eno); System.out.println(this.ename);
	  System.out.println(this.sal);
	  
	  }
	 
	public Employee(int eno, String ename) {
		this(1);
		System.out.println("I am in 2 parameter constructor");
		this.eno = eno;
		this.ename = ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}

	public Employee(int eno, String ename, float sal) {
		this(2,"Jhankar");
		System.out.println("I am in 3 parameter constructor");
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}

	public static void main(String[] args) {
		
		Employee e4 = new Employee(3, "Jhankar", 22000f);
			}
}
