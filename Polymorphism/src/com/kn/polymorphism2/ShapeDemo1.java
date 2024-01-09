package com.kn.polymorphism2;

public class ShapeDemo1 {

	public static void main(String[] args) {

		Geometry g = new Geometry();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();

		g.doActivity(c);
		g.doActivity(r);
		g.doActivity(s);
	}

}
