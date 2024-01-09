package com.kn.abstraction2;

abstract public class Program {

	// static variables
	static int i;

	// instance variables
	int j;

	// static block
	static {
		System.out.println("Static Block");
		i = 10;
	}

	// instance block
	{
		System.out.println("Instance Block");
		j = 20;
	}

	// concrete static method
	public static void m1() {
		System.out.println("Concrete static method");
	}

	// concrete instance method
	public void m2() {
		System.out.println("Concrete instance method");
	}

	// Abstract method
	public abstract void m3();

	// constructor

	public Program() {
		System.out.println("Parent Constructor");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("main() method");
	}

	// final method
	final public void m4() {
		System.out.println("final method from abstract class");
	}

}
