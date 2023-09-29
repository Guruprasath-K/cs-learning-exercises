package com.kn.arrays;

public class PrintOddEven {

	// Method to print the odd and even elements in an array
	public void printEvenOddElements(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even Numbers: " + arr[i]);
			} else {
				System.out.println("Odd Numbers: " + arr[i]);
			}
		}
	}

}
