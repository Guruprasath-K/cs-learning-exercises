package com.kn.elseifladder;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		String category = ageCategory(age);
		System.out.println(category);
		scan.close();
	}

	static String ageCategory(int age) {
		if (age >= 0 && age <= 12) {
			return "Child";
		} else if (age >= 13 && age <= 19) {
			return "Teen";
		} else if (age >= 20 && age <= 59) {
			return "Adult";
		} else if (age >= 60) {
			return "Senior";
		} else {
			return "Invalid Input";
		}
	}

}
