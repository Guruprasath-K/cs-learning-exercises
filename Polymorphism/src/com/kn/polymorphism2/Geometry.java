package com.kn.polymorphism2;

public class Geometry {

	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calculateArea());

		if (sh instanceof Circle) {
			System.out.println("Perimeter of Circle = " + ((Circle) (sh)).calculateCirclePerimeter());
			System.out.println("=================================================");
		} else if (sh instanceof Rectangle) {
			System.out.println("Perimeter of Rectangle = " + ((Rectangle) (sh)).calculateRectanglePerimeter());
			System.out.println("=================================================");
		} else {
			System.out.println("Perimeter of Square = " + ((Square) (sh)).calculateSquarePerimeter());
			System.out.println("=================================================");
		}
	}
}
