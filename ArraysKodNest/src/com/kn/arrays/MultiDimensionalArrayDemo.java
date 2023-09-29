package com.kn.arrays;

import java.util.Scanner;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[][] arr;

		// Array Creation
		System.out.println("Enter the number of Students = ");
		int size1 = scan.nextInt();
		System.out.println("Enter the Subjects per Students = ");
		int size2 = scan.nextInt();
		arr = new int[size1][size2];

		// Array Initialization
		for (int i = 0; i < size1; i++) {
			System.out.println("Enter Student " + (i + 1) + " data :");
			for (int j = 0; j < size2; j++) {
				System.out.println("Enter subject " + (j + 1) + " marks :");
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("**********************************************************");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student " + (i + 1) + " data:");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Subject " + (i + 1) + " marks = " + arr[i][j]);
			}
		}
		scan.close();
	}

}
