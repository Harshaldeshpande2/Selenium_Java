package com.Exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		int nr, dr, result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator value");
		nr = sc.nextInt();
		System.out.println("Enter the denominator value");
		dr = sc.nextInt();

		try {
			result = nr / dr;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("Denominator value should be greater than 0");
		}
	}

}
 