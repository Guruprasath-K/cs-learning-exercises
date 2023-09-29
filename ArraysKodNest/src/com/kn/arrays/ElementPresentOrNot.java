package com.kn.arrays;

import java.util.Scanner;

public class ElementPresentOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the size of array:");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the data for the element " + (i + 1) + " :");
			arr[i] = scan.nextInt();
		}

		// Getting Input of the specific element
		System.out.println("Enter the Element that need to be found:");
		int ele = scan.nextInt();

		boolean flag = isElementPresentOrNot(arr, ele);
		if (flag) {
			System.out.println("The Element " + ele + " is present");
		} else {
			System.out.println("The Element " + ele + " is not present");
		}

		scan.close();
	}

	// Method to find whether the element is present or not in an array
	public static boolean isElementPresentOrNot(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return true;

			}
		}
		return false;
	}

}
