package com.kn.matrixaddition;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Initialization
		int[][] arr = new int[3][3];
		int[][] brr = new int[3][3];

		// Array Declaration
		System.out.println("Enter the elements in the first array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("*************************************");

		System.out.println("Enter the elements in the second array");
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				brr[i][j] = scan.nextInt();
			}
		}


		// Call the method for the addition of the matrix
		int result[][] = matrixAddition(arr, brr);

		// Print the resultant data
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
		}
		scan.close();

	}

	private static int[][] matrixAddition(int[][] arr, int[][] brr) {
		int[][] crr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		return crr;
	}

}
