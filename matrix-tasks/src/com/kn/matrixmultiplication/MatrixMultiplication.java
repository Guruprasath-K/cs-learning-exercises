package com.kn.matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

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

		findMultiplication(arr, brr);
		scan.close();

	}

	public static void findMultiplication(int[][] arr, int[][] brr) {
		int[][] crr = new int[3][3];
		System.out.println("Matrix Multiplication");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				crr[i][j] = 0;
				for (int k = 0; k < crr[i].length; k++) {
					crr[i][j] = crr[i][j] + arr[i][j] * brr[i][j];
				}
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
