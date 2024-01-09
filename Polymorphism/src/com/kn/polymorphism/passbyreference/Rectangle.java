package com.kn.polymorphism.passbyreference;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle Shape");
	}

	@Override
	public double calculateArea() {
		double l = 5.5, b = 10.5;
		return l * b;
	}
}
