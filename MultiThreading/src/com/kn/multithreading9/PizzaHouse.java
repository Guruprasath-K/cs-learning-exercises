package com.kn.multithreading9;

public class PizzaHouse {

	int token;
	boolean isAvailable = false;

	public synchronized void bake(int num) {
		try {
			if (isAvailable == false) {
				token = num;
				System.out.println("Baker is baking for " + token);
				isAvailable = true;
				notify();
			} else {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void eat() {
		if (isAvailable == true) {
			System.out.println("Customer is eating pizza for " + token);
			isAvailable = false;
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
