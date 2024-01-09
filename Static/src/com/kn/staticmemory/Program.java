package com.kn.staticmemory;

public class Program {

	// Static Variable
	static int x, y;

	// Static Block
	static {
		System.out.println("Static Block");
		x = 10;
		y = 20;
	}

	// Static Method
	public static void display1() {
		System.out.println("Static method display1()");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

	// Instance Variable
	int a, b;

	// Instance Block
	{
		System.out.println("Instance Block");
		a = 11;
		b = 22;
		x = 100;
		y = 200;
	}

	// Instance Method
	public void display2() {
		System.out.println("Instance method display2()");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public Program() {
		System.out.println("Constructor");
	}

}
