package com.kn.recursion1;

public class Factorial {

	public int findFactorial(int input) {

		if (input == 1) {
			return 1;
		} else {
			return input * findFactorial(input - 1);
		}
	}

}
