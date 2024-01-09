package com.kn.interface4;

public class Meal implements MainCourse, Dessert {

	@Override
	public void biriyani() {
		System.out.println("Hyderabadi Biriyani");
	}

	@Override
	public void rasamalai() {
		System.out.println("Rasamalai - 20 pieces");
	}

}
