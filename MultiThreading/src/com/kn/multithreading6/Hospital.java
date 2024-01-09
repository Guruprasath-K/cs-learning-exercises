package com.kn.multithreading6;

public class Hospital {

	public static void main(String[] args) {

		Treatment treatment = new Treatment();

		Thread t1 = new Thread(treatment);
		Thread t2 = new Thread(treatment);

		t1.setName("Tom");
		t2.setName("Jerry");
		t1.start();
		t2.start();
	}

}
