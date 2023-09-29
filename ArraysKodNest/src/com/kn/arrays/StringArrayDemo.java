package com.kn.arrays;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		String[] arr;

		// Array Creation
		System.out.println("Enter the Array Size:");
		arr = new String[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the String Data for Element " + (i + 1) + "=");
			arr[i] = scan.next();
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
