package com.kn.polymorphism.passbyreference;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square Shape");
	}

	@Override
	public double calculateArea() {
		double side = 5.5;
		return side * side;
	}

}
