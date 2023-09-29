package com.kn.arrays;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		int[][] arr = new int[2][];
		arr[0] = new int[4];
		arr[1] = new int[2];

		// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Student " + (i + 1) + " data:");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter Subject " + (j + 1) + " marks:");
				arr[i][j] = scan.nextInt();
			}

		}
		System.out.println("************************************************");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student " + (i + 1) + " data:");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Subject " + (j + 1) + " marks: " + arr[i][j]);
			}
		}
		scan.close();
	}

}
