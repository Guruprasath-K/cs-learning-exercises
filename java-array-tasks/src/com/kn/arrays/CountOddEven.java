package com.kn.arrays;

public class CountOddEven {

	// Method for counting the odd and even elements in an array
	public void countEvenOddElements(int[] arr) {

		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of Even Numbers = " + evenCount);
		System.out.println("Number of Odd Numbers = " + oddCount);
	}


}
