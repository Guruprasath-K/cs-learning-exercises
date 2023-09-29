package com.kn.arrays;

import java.util.Scanner;

public class FindElement {

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

		System.out.println("Enter the Element that need to be found");
		int element = scan.nextInt();

		int position = elementPresentOrNot(arr, element);

		if (position < 0) {
			System.out.println("The Element is not found");
		} else {
			System.out.println("The Element " + element + " is at position " + position);
		}
		scan.close();
	}

	public static int elementPresentOrNot(int[] arr, int element) {
		boolean isFound = false;
		int position = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				isFound = true;
				position = ++i;
				break;
			}
		}

		if (isFound) {
			return position;
		} else {
			return -1;
		}

	}

}
