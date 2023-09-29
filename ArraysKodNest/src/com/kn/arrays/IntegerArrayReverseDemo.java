package com.kn.arrays;

import java.util.Scanner;

public class IntegerArrayReverseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter the Array Size:");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("Enter the data for the element " + (i + 1) + "=");
			arr[i] = scan.nextInt();
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
