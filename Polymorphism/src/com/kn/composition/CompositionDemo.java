package com.kn.composition;

public class CompositionDemo {

	public static void main(String[] args) {
		Book book = new Book("Page #1 has introduction");
		book.readBook();

		book = null;
		// After deleting book page doesn't exist anymore
	}

}
