package com.kn.arrays;

import java.util.Scanner;

public class BinarySearch {

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

		binarySearch(arr, element);
		scan.close();
	}

	// Method to do binary search of an Element in an Array
	public static void binarySearch(int[] arr, int element) {
		int position = -1;
		boolean isElementFound = false;
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (element == arr[mid]) {
				isElementFound = true;
				System.out.println(isElementFound + "<----");
				position = mid + 1;
				break;
			} else if (element > arr[mid]) {
				low = mid + 1;
				high = high;
			} else {
				high = mid - 1;
				low = low;
			}
		}
		if (isElementFound) {
			System.out.println("The Given Element " + element + " is found at position " + position);
		} else {
			System.out.println("The Given Element " + element + " is not found");
		}

	}


}
