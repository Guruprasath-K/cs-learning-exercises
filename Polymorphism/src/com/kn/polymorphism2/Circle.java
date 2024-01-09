package com.kn.polymorphism2;

public class Circle extends Shape {

	double radius = 5.5;

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	// Child Specific Method
	public double calculateCirclePerimeter() {
		return 2 * Math.PI * radius;
	}

}
