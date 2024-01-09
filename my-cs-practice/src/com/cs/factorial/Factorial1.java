package com.cs.factorial;

public class Factorial1 {

	public int findFactorial(int num) {
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

}
