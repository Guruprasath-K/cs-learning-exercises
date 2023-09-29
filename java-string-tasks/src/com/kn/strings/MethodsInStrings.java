package com.kn.strings;

public class MethodsInStrings {

	public static void main(String[] args) {

		String s1 = "Rama Raja Mohan";

		System.out.println("Upper Case");
		System.out.println(s1.toUpperCase());

		System.out.println("Lower Case");
		System.out.println(s1.toLowerCase());

		System.out.println("Character at given index");
		System.out.println(s1.charAt(2));

		System.out.println("Index of given character at first time");
		System.out.println(s1.indexOf('a'));

		System.out.println("Index of given character at last time");
		System.out.println(s1.lastIndexOf('a'));

		System.out.println("Part of the given String from given index");
		System.out.println(s1.substring(5));

		System.out.println("Part of the given String from & till given index");
		System.out.println(s1.substring(5, 12));

		System.out.println("String contains");
		System.out.println(s1.contains("Rama"));
	}

}
