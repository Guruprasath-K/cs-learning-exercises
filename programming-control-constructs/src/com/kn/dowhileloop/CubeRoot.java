package com.kn.dowhileloop;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		double result = calculateCubeRoot(num);
		System.out.println(result);
		scan.close();
	}

	public static double calculateCubeRoot(int num) {
		double i = 1.0;
		double r = 1;
		double root = 1;
		do {
			r = i * i * i;
			if (r == num) {
				root = i;
			}
			i++;
		} while (i < num);

		return root;
	}

}
