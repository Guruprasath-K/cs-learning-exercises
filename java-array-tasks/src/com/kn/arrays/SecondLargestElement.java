package com.kn.arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the Array Size: ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		System.out.println("Enter the Data for Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int result = secondLargestElement(arr);
		System.out.println("The Second Largest Element in the given array is " + result);
		scan.close();
	}

	// Method to get the Second Largest Element in an array
	public static int secondLargestElement(int[] arr) {
		int firstLargestNumber = -2147483648;
		int secondLargestNumber = 2147483647;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargestNumber) {
				secondLargestNumber = firstLargestNumber;
				firstLargestNumber = arr[i];
			} else if (arr[i] > secondLargestNumber && arr[i] != firstLargestNumber) {
				secondLargestNumber = arr[i];
			}
		}

		return secondLargestNumber;


	}

}
