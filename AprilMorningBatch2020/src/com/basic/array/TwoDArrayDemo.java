package com.basic.array;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int[] x = new int[4];

		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;

		int[][] a = new int[3][3]; // 2 D array
		// 0th row
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		// 1st row
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;

		// 2nd row
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
