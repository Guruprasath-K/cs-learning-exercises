package com.kn.romannumber;

public class RomanNumber {

	public String romanNumber(int input) {

		String[] srr = { "M", "CM", "D", "CD", "C", "CX", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] arr = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		StringBuffer sb1 = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			while (input >= arr[i]) {
				input = input - arr[i];
				sb1.append(srr[i]);
			}
		}

		String output = new String(sb1);
		return output;
	}

}
