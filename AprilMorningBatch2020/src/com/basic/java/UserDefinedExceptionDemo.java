package com.basic.java;

import java.util.Scanner;

public class UserDefinedExceptionDemo extends Exception {

	public UserDefinedExceptionDemo(String msg) {

		super(msg);
	}

	public static void main(String[] args) {

		String num;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter an alphanumeric value :");

			num = sc.nextLine();

			try {
				if (num.length() != 10) {
					throw new UserDefinedExceptionDemo("Number should be 10 digit");

				} else {
					System.out.println(num);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				
				System.out.println("I am in finally block");
			}

		}
		
	}

}
