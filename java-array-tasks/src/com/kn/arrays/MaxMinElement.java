package com.kn.arrays;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the Array Size: ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		System.out.println("Enter the Data for Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		getMaxMinElement(arr);
		scan.close();
	}

	// Method to get Maximum and Minimum Element in an Array
	public static void getMaxMinElement(int[] arr) {
		int max = -2147483648;
		int min = 2147483647;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
				}
			}
		System.out.println("The Maximum Value of the Array: " + max);
		System.out.println("The Minimum Value of the Array: " + min);
		}
		
	}

