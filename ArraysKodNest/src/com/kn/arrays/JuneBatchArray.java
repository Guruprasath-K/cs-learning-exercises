package com.kn.arrays;

import java.util.Scanner;

public class JuneBatchArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		String[][] arr;

		// Array Creation
		System.out.println("Enter the number of Batches: ");
		arr = new String[scan.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Number of Friends in A" + (i + 1) + " batch: ");
			arr[i] = new String[scan.nextInt()];
		}
		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the A" + (i + 1) + " Batch Friends details:");
			System.out.println("I have " + arr[i].length + " friends");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the name of Friend " + (j + 1));
				String name = scan.next();
				arr[i][j] = name;
			}
		}
		System.out.println("**************************************************");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("A" + (i + 1) + " Batch Friends:");
			System.out.println("I have " + arr[i].length + " friends");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Friend " + (j + 1) + " : " + arr[i][j]);

			}
		}
		scan.close();

	}

}
