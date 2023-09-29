package com.kn.recursion2;

import java.util.Scanner;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int input = scan.nextInt();

		// Create object of the FibonacciSeries Class
		FibonacciSeries f1 = new FibonacciSeries();

		// Call the method for the fibonacci series
		int result = f1.fibonacciSeries(input);

		// Print Resultant data
		System.out.println("Fibonacci series up to " + input + " numbers:");
		for (int i = 0; i < input; i++) {
			System.out.print(f1.fibonacciSeries(i) + " ");
		}

		// Release Resources
		scan.close();

	}


}
