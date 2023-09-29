package com.guru.oops2;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(123, "OOPS", "Guru");

		book.addReview(new Review(10, "awesome", 5));
		book.addReview(new Review(101, "nice", 5));

		System.out.println(book);
	}
}
