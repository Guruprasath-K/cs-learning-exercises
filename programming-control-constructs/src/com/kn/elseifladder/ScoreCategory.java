package com.kn.elseifladder;

import java.util.Scanner;

public class ScoreCategory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Score: ");
		int score = scan.nextInt();

		String category = scoreCategory(score);
		System.out.println(category);
		scan.close();
	}

	static String scoreCategory(int score) {
		if (score >= 90 && score <= 100) {
			return "A";
		} else if (score >= 80 && score <= 89) {
			return "B";
		} else if (score >= 70 && score <= 79) {
			return "C";
		} else if (score >= 60 && score <= 69) {
			return "D";
		} else if (score < 60) {
			return "F";
		} else {
			return "Invalid Input";
		}

	}

}
