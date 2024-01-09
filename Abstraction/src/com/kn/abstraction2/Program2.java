package com.kn.abstraction2;

public class Program2 extends Program {

	@Override
	public void m3() {
		System.out.println("abstract method overidden in child class");
	}

	public Program2() {
		super();
		System.out.println("Child class constructor");
	}

}
