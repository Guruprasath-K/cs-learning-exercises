package com.kn.interface6;

public interface Interface1 {

	// abstract method
	public abstract void m1();

	// static method
	public static void m2() {
		System.out.println("Static method");
	}

	// constructors
	// public Interface1() {

	// }
	// We cannot create object as there is no concept of constructors in interface

	// main() method
	public static void main(String[] args) {
		System.out.println("Main method -----> interface");
		m4();
	}

	// default methods
	default void m3() {
	}

	// private static method
	private static void m4() {
		System.out.println("Private Static method");
	}
	// public abstract methods can be marked as private but the method should be
	// locally used
	// In order to locally use it in main within the class, it should be marked as
	// static.

}
