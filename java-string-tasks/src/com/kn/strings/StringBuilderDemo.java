package com.kn.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder1 = new StringBuilder("Ram");
		System.out.println("Data = " + stringBuilder1);
		System.out.println("Length = " + stringBuilder1.length());
		System.out.println("Capacity = " + stringBuilder1.capacity());
		System.out.println("***************************************");
		stringBuilder1 = stringBuilder1.append("Sita");
		System.out.println("Data = " + stringBuilder1);
		System.out.println("Length = " + stringBuilder1.length());
		System.out.println("Capacity = " + stringBuilder1.capacity());
	}

}
