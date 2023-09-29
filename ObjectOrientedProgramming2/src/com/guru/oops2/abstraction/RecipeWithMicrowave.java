package com.guru.oops2.abstraction;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch ON the Microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Get the raw materials");
		System.out.println("Switch OFF the Microwave");
	}
}