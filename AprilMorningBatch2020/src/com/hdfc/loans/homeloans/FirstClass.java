package com.hdfc.loans.homeloans;

public class FirstClass {

	int a = 20, b = 10, c; // properties

	public void add() // behaviour
	{
		c = a + b;
		System.out.println("The addition of a and b is " + c);

	}

	public void sub() {
		c = a - b;
		System.out.println("The subtraction of a and b is " + c);
	}

	public static void main(String[] args) {

		FirstClass f1 = new FirstClass();
		f1.add();
		f1.sub();
		
		FirstClass f2 = new FirstClass();
		f2.add();
		f2.sub();

	}

}
