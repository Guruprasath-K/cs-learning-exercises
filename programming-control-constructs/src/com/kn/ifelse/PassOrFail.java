package com.kn.ifelse;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Marks:");
		int marks = scan.nextInt();

		boolean grade = calculateGrade(marks);
		if (grade) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		scan.close();
	}

	static boolean calculateGrade(int marks) {
		if (marks > 50) {
			return true;
		} else {
			return false;
		}
	}
}
