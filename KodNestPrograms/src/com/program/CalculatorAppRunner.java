package com.program;

import java.util.Scanner;

public class CalculatorAppRunner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers = ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		CalculatorApp c = new CalculatorApp();
		c.add(a, b);
		c.sub(a, b);
		c.mul(a, b);
		c.div(a, b);
		c.mod(a, b);
	}

}
