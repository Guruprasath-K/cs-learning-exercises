package com.kn.stringpalindrome;

import java.util.Scanner;

public class StringPalindromeDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of StringPalindrome Class
		StringPalindrome palindrome = new StringPalindrome();

		// Call the method to find whether the string is a Palindrome
		boolean flag = palindrome.isPalindrome(inputString);

		// Print the resultant data
		if (flag == true) {
			System.out.println("The Given String is a Palindrome");
		} else {
			System.out.println("The Given String is not a Palindrome");
		}

		// Release Resources
		scan.close();
	}

}
