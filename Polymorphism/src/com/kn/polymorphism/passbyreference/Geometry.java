package com.kn.polymorphism.passbyreference;

public class Geometry {

	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calculateArea());
	}

}
