package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Letter: ");
		char letter = scan.next().charAt(0);

		boolean print = capitalLetter(letter);
		if (print) {
			System.out.println("Capital Letter");
		} else {
			System.out.println("Not a Capital Letter");
		}
		scan.close();
	}

	static boolean capitalLetter(char letter) {
		if (letter >= 'A' && letter <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

}
