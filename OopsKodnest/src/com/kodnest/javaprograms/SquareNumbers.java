package com.kodnest.javaprograms;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to square :");
		int num = scan.nextInt();

		int square = squareNumbers(num);
		System.out.println("The Square of Number = " + square);
		scan.close();
	}

	public static int squareNumbers(int num) {
		return num * num;
	}

}
