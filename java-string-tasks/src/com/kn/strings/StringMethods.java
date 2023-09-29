package com.kn.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Rama Raja Mohan";

		System.out.println("Length of the String: ");
		System.out.println(s1.length());

		System.out.println("The Given String starts with R: ");
		System.out.println(s1.startsWith("R"));

		System.out.println("The Given String ends with n: ");
		System.out.println(s1.endsWith("n"));

		System.out.println("Replace the characters: ");
		System.out.println(s1.replace('a', 's'));

		System.out.println("Replace the substring: ");
		System.out.println(s1.replaceAll("Rama", "Arun"));

		System.out.println("Split: ");
		String[] srr = s1.split(" ");
		System.out.println(srr);

		System.out.println("Trim: ");
		System.out.println(s1.trim());

		System.out.println("to Character Array: ");
		System.out.println(s1.toCharArray());

	}

}
