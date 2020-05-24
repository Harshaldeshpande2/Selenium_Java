package com.hdfc.loans.homeloans;

public class Hdfc implements Rbi
{
	@Override
	public void withdrawl() {
		System.out.println("I am overrident withdrawl from HDFC");
		
	}

	@Override
	public void deposit() {
	
		System.out.println("I am overrident deposit from HDFC");
				
	}
	public static void main(String[] args) {
		
		Hdfc h1 = new Hdfc();
		h1.deposit();
		h1.withdrawl();
		

	}

	
}
