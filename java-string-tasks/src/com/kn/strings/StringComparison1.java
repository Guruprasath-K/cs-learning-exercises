package com.kn.strings;

public class StringComparison1 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";

		if (s1 == s2) {
			System.out.println("Same Reference");
		} else {
			System.out.println("Different Reference");
		}

		if (s1.equals(s2)) {
			System.out.println("Same Strings");
		} else {
			System.out.println("Different Strings");
		}
	}

}
