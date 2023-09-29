package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter the Array Size: ");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the data for the Element " + (i + 1) + "=");
			arr[i] = scan.nextInt();
		}

		int value = findSumOfArrays(arr);
		System.out.println(value);
		scan.close();

	}

	// Method to calculate the sum of elements in an array
	public static int findSumOfArrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

}
