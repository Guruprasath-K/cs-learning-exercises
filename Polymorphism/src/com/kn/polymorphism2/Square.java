package com.kn.polymorphism2;

public class Square extends Shape {

	double side = 5.5;

	@Override
	public double calculateArea() {
		return side * side;
	}

	// Child Specific Method
	public double calculateSquarePerimeter() {
		return 4 * side;
	}

}
