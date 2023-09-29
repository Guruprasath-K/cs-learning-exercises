package com.kn.arraysmerging2;

import java.util.Scanner;

public class ArraysMerging2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr = new int[5];
		int[] brr = new int[5];

		// Array initialization
		System.out.println("Enter the elements in the first array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the elements in the second array:");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = scan.nextInt();
		}

		int[] result = arrayMerging(arr, brr);

		for (int element : result) {
			System.out.println(element);
		}
		scan.close();
	}

	public static int[] arrayMerging(int[] arr, int[] brr) {
		int[] crr = new int[arr.length + brr.length];

		int a = 0;
		int b = brr.length - 1;
		for (int i = 0; i < crr.length; i++) {
			if (i % 2 == 0) {
				crr[i] = arr[a];
				a++;
			} else {
				crr[i] = brr[b];
				b--;
			}
		}
		return crr;

	}

}
