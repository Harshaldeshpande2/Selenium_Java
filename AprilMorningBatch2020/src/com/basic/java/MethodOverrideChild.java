package com.basic.java;

public class MethodOverrideChild extends MethodOverrideParent {

	public void love() {
		System.out.println("I am in love");
	}

	public void workhard() {
		System.out.println("Wake up anytime and enjoy");
	}

	public void care() {
		System.out.println("No care...Only Tiktok");
	}

	public static void main(String[] args) {

		MethodOverrideChild m1 = new MethodOverrideChild();
		m1.love();
		m1.care();

		MethodOverrideParent mp;
		mp = new MethodOverrideChild();
		mp.workhard();

		mp = new Child1();
		mp.workhard();

	}

}

class Child1 extends MethodOverrideParent

{

	public void workhard() {
		System.out.println("Wake up na na  and enjoy");
	}
}
