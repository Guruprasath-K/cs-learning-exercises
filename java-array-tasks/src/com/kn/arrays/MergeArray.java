package com.kn.arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the size of the first Array: ");
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter the size of the second Array: ");
		int brr[] = new int[scan.nextInt()];

		// Array Initialization
		System.out.println("Enter the data for the Elements in the first Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the data for the Elements in the second Array:");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = scan.nextInt();
		}

		int crr[] = mergeArray(arr, brr);

		// Array Traversing
		System.out.println("First Array Elements: ");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println("Second Array Elements: ");
		for (int i : brr) {
			System.out.println(i + " ");
		}
		System.out.println("Third Array Elements: ");
		for (int i : crr) {
			System.out.println(i + " ");
		}
		scan.close();


	}

	// Method for Merging Two Arrays
	public static int[] mergeArray(int[] arr, int[] brr) {

		int crr[] = new int[arr.length + brr.length];
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		int j = 0;
		for (int i = arr.length; i < crr.length; i++) {
			crr[i] = brr[j];
			j++;
		}

		return crr;

	}

}
