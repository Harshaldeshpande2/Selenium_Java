package com.hdfc.loans.homeloans;

public class Icici implements Rbi{

	public void withdrawl() {
		System.out.println("I am overrident withdrawl from Icici");
		
	}

	@Override
	public void deposit() {
	
		System.out.println("I am overrident deposit from Icici");
				
	}
	public static void main(String[] args) {
		
		Icici i1= new Icici();
		i1.deposit();
		i1.withdrawl();
		
	}
}
