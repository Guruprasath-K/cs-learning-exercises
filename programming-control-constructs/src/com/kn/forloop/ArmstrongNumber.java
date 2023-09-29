package com.kn.forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		printArmstrongNumbers(num);
		scan.close();
	}

	public static void printArmstrongNumbers(int num) {
		for (int j = 1; j <= num; j++) {
		int r, arm = 0;
		int temp = j;
		for (; temp > 0;) {
			r = temp % 10;
			arm = arm + (r * r * r);
			temp = temp / 10;
		}
			if (arm == j) {
				System.out.print(j + " ");
			}
		}
	}
}

