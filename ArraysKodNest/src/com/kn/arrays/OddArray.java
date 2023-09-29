package com.kn.arrays;

import java.util.Scanner;

public class OddArray {

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

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}

}
