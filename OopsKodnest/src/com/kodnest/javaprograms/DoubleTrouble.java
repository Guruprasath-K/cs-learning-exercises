package com.kodnest.javaprograms;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Score");
		int num = scan.nextInt();

		int dbl = doubleTheNumber(num);
		System.out.println("The Value of the number doubled : " + dbl);
		scan.close();
	}

	public static int doubleTheNumber(int num) {
		return num * 2;

	}

}
