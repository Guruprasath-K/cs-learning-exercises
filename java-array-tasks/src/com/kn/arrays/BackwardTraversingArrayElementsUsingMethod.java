package com.kn.arrays;

import java.util.Scanner;

public class BackwardTraversingArrayElementsUsingMethod {

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
		int crr[] = backwardTraversingArray(arr);
		for (int i = crr.length - 1; i >= 0; i--) {
			System.out.print(crr[i] + " ");
		}
		scan.close();

	}

	// Method for Backward Traversing Array Elements
	private static int[] backwardTraversingArray(int[] arr) {
		System.out.println("----> backwardTraversingArray() called");
		int[] brr = new int[arr.length];
		for (int i = brr.length - 1; i >= 0; i--) {
			brr[i] = arr[i];
		}
		return brr;
	}
}
