package com.kn.arrays;

import java.util.Scanner;

public class EvenOddElementsArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter the Array Size:");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the data for the element " + (i + 1) + " :");
			arr[i] = scan.nextInt();
		}

		evenOrOddElements(arr);
		scan.close();
	}

	public static void evenOrOddElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is Even");
			} else {
				System.out.println(arr[i] + " is Odd");
			}
		}
	}

}
