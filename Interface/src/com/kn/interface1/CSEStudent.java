package com.kn.interface1;

public class CSEStudent implements Student {

	@Override
	public void study() {
		System.out.println("Studying Algorithms");
	}

	@Override
	public void doProject() {
		System.out.println("Working E-Commerce App");
	}

}
