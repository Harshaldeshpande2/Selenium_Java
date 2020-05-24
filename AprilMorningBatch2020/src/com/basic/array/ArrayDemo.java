package com.basic.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		/*
		 * int [] a = {10,20,30,40};
		 * 
		 * for (int i =0;i<a.length;i++) { System.out.println("a["+i+"]=" +a[i]); //
		 * System.out.println(a[i]); }
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size");
		int asize = sc.nextInt();
		int sum = 0;

		int[] a = new int[asize];
		System.out.println("Enter th array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			System.out.println("a[" + i + "]=" + a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum of an array is" + sum);

	}

}
