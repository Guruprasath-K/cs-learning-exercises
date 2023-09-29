package com.kn.arrays;

import java.util.Scanner;

public class Addition2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		int[][] arr = new int[2][5];
		int[][] brr = new int[arr.length][arr[0].length];

		// Array Initialization
		System.out.println("----> ARRAY 1 <----");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Data " + (i + 1) + " :");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the data for Array " + (j + 1) + " Elements:");
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("----> ARRAY 2 <----");
		for (int i = 0; i < brr.length; i++) {
			System.out.println("Data " + (i + 1) + " :");
			for (int j = 0; j < brr[i].length; j++) {
				System.out.println("Enter the data for Array " + (j + 1) + " Elements:");
				brr[i][j] = scan.nextInt();
			}
		}

		find2DArraySum(arr, brr);
		scan.close();
	}

	static void find2DArraySum(int[][] arr, int[][] brr) {
		int crr[][] = new int[arr.length][arr[0].length];
		System.out.println("The Sum of Two 2D Arrays:");
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
	}

}
