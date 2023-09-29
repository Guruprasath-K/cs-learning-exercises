package com.kn.arrays;

import java.util.Scanner;

public class PrintOddandEvenElements {

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

		int crr[] = oddAndEvenElements(arr);
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] % 2 == 0) {
				System.out.println("Even Numbers: " + crr[i]);
			} else {
				System.out.println("Odd Numbers: " + crr[i]);
			}
		}
		scan.close();

	}

	// Method to find the Odd and Even Elements in the array
	private static int[] oddAndEvenElements(int[] arr) {
		System.out.println("----> oddAndEvenElements() called");
		int brr[] = new int[arr.length];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[i];

		}
		return brr;
	}

}
