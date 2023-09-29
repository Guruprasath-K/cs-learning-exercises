package com.kn.strings;

public class StringCompareTo {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sourav";

		System.out.println(s1.compareTo(s2));

		if (s1.compareTo(s2) > 0) {
			System.out.println("s1 is greater than s2");
		} else if (s1.compareTo(s2) < 0) {
			System.out.println("s2 is greater the s1");
		} else {
			System.out.println("s1 and s2 are Equal Lexicographically ");
		}

	}

}
