package com.cs.factorial.recursion;

public class Factorial {

	public int findFactorial(int input) {

		if (input == 1) {
			return 1;
		} else {
			return input * findFactorial(input - 1);
		}
	}
}
