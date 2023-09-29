package com.kn.arrays;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[][][] arr;

		// Array Creation
		arr = new int[2][2][2];

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
