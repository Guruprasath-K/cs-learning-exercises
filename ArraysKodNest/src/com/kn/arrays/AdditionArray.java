package com.kn.arrays;

import java.util.Scanner;

public class AdditionArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;
		int[] brr;

		// Array Creation
		System.out.println("Enter the Array Size for first array:");
		arr = new int[scan.nextInt()];
		brr = new int[arr.length];

		// Array Initialization
		System.out.println("----> Array 1 <-----");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the details for Element " + (i + 1) + " :");
			arr[i] = scan.nextInt();
		}
		System.out.println("----> Array 2 <-----");
		for (int i = 0; i < brr.length; i++) {
			System.out.println("Enter the details for Element " + (i + 1) + " :");
			brr[i] = scan.nextInt();
		}

		getAddition(arr, brr);
		scan.close();
	}

	// Method to get the Addition of two array elements which forms the third array
	// elements
	static void getAddition(int[] arr, int[] brr) {
		int[] crr = new int[arr.length];
		System.out.println("The Sum of Two Arrays:");
		for (int i = 0; i < crr.length; i++) {
			crr[i] = arr[i] + brr[i];
			System.out.println(crr[i]);

		}
	}


}
