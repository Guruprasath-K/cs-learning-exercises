package com.kn.polymorphism.passbyreference;

public class ShapeDemo {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();

		Geometry g = new Geometry();
		g.doActivity(r);
		g.doActivity(s);
		g.doActivity(c);
	}

}
