package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray3D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[][][] arr;

		// Array Creation
		// arr = new int[2][2][2];
		System.out.println("Enter the size of Arrays: ");

		arr = new int[scan.nextInt()][][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of 2nd and 3D Array: ");
			int size1 = scan.nextInt();
			int size2 = scan.nextInt();
			arr[i] = new int[size1][size2];

		}

		// Array Initialization
		System.out.println("Enter Data: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

		// Array Initialization
		System.out.println("Array Elements are as follows: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);

				}
			}
		}
		scan.close();
	}


}
