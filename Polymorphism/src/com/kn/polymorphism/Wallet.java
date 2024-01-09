package com.kn.polymorphism;

public class Wallet extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment done by E-Wallet");
	}
}
