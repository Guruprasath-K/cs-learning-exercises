package com.guru.book;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(100);
		Book cleanCode = new Book(100);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.setNoOfCopies(10);

		effectiveJava.setNoOfCopies(20);

		cleanCode.setNoOfCopies(30);

		artOfComputerProgramming.increaseNoOfCopies(10);

		effectiveJava.increaseNoOfCopies(20);

		cleanCode.increaseNoOfCopies(30);




	}
}