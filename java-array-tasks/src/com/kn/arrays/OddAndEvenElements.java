package com.kn.arrays;

import java.util.Scanner;

public class OddAndEvenElements {

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
		
		PrintOddEven printOddEven = new PrintOddEven();
		System.out.println("----->Object Created Successfully<-----");
		System.out.println("Odd and Even Elements:");
		printOddEven.printEvenOddElements(arr);

		CountOddEven countOddEven = new CountOddEven();
		System.out.println("----->Object Created Successfully<-----");
		System.out.println("Odd and Even Elements Count:");
		countOddEven.countEvenOddElements(arr);

		scan.close();
	}


}
