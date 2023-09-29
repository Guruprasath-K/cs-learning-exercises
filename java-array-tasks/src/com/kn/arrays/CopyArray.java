package com.kn.arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter the size of the array");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the data for Element " + (i + 1) + " :");
			arr[i] = scan.nextInt();
		}

		System.out.println("---->Initialization Done in main()");
		int crr[] = copyArrayData(arr);
		System.out.println("The Element Datas are as follows:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(crr[i] + " ");
		}
		scan.close();

	}

	// Method to copy the data in an array to another array
	static int[] copyArrayData(int[] arr) {
		System.out.println("----> copyArrayData() called");
		int[] brr = new int[arr.length];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[i];
		}
		return brr;
	}

}
