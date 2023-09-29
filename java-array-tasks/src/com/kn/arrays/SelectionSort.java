package com.kn.arrays;

public class SelectionSort {

	int[] selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
				// Swapping Minimum Element
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
		}
		return arr;
		
	}

}
