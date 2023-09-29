package com.kn.recursion2;

public class FibonacciSeries {

	public int fibonacciSeries(int input) {
		if (input <= 1) {
			return 1;
		} else {
			return fibonacciSeries(input - 1) + fibonacciSeries(input - 2);
		}
	}
}
