package com.kn.polymorphism;

public class UPI extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment done by UPI");
	}

}
