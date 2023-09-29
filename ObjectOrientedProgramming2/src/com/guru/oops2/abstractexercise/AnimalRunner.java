package com.guru.oops2.abstractexercise;

public class AnimalRunner {

	public static void main(String[] args) {
		AbstractAnimal[] animals = { new Dog(), new Cat() };
		for (AbstractAnimal animal : animals) {
			animal.bark();
		}
	}

}
