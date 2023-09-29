package com.kn.arrays;

import java.util.Scanner;

public class DoubleArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration;
		double[] arr;

		// Array Creation;
		System.out.println("Enter the Array Size");
		arr = new double[scan.nextInt()];

		// Array Initialization

		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the data for element" + (i + 1) + " = ");
			arr[i] = scan.nextDouble();
			k = k + 10;

		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
