package com.kn.strings;

public class StringComparison2 {

	public static void main(String[] args) {
		String s3 = new String("Sita");
		String s4 = new String("Sita");

		if (s3 == s4) {
			System.out.println("Same Reference");
		} else {
			System.out.println("Different Reference");
		}

		if (s3.equals(s4)) {
			System.out.println("Same Strings");
		} else {
			System.out.println("Different Strings");
		}
	}

}
