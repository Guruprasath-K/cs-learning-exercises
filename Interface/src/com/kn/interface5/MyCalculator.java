package com.kn.interface5;

public abstract class MyCalculator implements Calculator1, Calculator2 {

	@Override
	public void multiplication() {
		System.out.println("Multiplication");
	}

	@Override
	public void division() {
		System.out.println("Division");
	}


}
