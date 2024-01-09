package com.kn.polymorphism2;

public class Rectangle extends Shape {

	double l = 5.5, b = 3.5;

	@Override
	public double calculateArea() {
		return l * b;
	}

	// Child Specific Method
	public double calculateRectanglePerimeter() {
		return 2 * (l + b);
	}

}
