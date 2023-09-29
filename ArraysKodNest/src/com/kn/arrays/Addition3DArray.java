package com.kn.arrays;

import java.util.Scanner;

public class Addition3DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		int[][][] arr = new int[2][2][2];
		int[][][] brr = new int[arr.length][arr[0].length][arr[0][0].length];

		// Array Initialization
		System.out.println("----> ARRAY 1 <----");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Data " + (i + 1) + " :");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inner Array " + (j + 1) + " :");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the data for Array " + (k + 1) + " Elements:");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		System.out.println("----> ARRAY 2 <----");
		for (int i = 0; i < brr.length; i++) {
			System.out.println("Data " + (i + 1) + " :");
			for (int j = 0; j < brr[i].length; j++) {
				System.out.println("Inner Array " + (j + 1) + " :");
				for (int k = 0; k < brr[i][j].length; k++) {
					System.out.println("Enter the data for Array " + (k + 1) + " Elements:");
					brr[i][j][k] = scan.nextInt();
				}
			}
		}
		find3DArraySum(arr, brr);
		scan.close();
	}

	// Method to find the sum of two 3d arrays
	private static void find3DArraySum(int[][][] arr, int[][][] brr) {
		int[][][] crr = new int[arr.length][arr[0].length][arr[0][0].length];
		System.out.println("The Sum of Two 3D Arrays: ");
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				for (int k = 0; k < crr[i][j].length; k++) {
					crr[i][j][k] = arr[i][j][k] + brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
			}
		}
	}
}