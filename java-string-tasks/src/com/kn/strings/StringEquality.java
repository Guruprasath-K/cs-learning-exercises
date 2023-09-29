package com.kn.strings;

public class StringEquality {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "RAM";

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		System.out.println("************************************");
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
