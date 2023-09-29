package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortDemo {

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
		
		SelectionSort sorted = new SelectionSort();
		int result[] = sorted.selectionSort(arr);
		System.out.println("The Sorted Array: ");

		for (int i : result) {
			System.out.print(i + " ");
		}

		scan.close();
	}

}
