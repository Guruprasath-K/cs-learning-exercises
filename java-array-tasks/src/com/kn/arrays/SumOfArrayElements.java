package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the Size of Array:");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the data for Element " + (i + 1) + " :");
			arr[i] = scan.nextInt();
		}

		System.out.println("-----> Initialization Done in main()");

		System.out.println("The Sum of the Array Elements: ");
		System.out.println(getArraySum(arr));
		scan.close();

	}

	// Method to find the Sum of Elements in an array
	static int getArraySum(int[] arr) {
		System.out.println("----> getArraySum() called");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

}
