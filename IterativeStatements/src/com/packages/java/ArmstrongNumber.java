package com.packages.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();
		
		int r, arm = 0;
		int temp = num;
		
		while (num>0) {
			r = num%10;
			arm = (r * r * r) + arm;
			num = num / 10;
		}
		if (temp == arm) {
			System.out.println("It is an Armstrong Number");
		} else {
			System.out.println("It is not an Armstrong Number");
		}
		scan.close();
	}

}
