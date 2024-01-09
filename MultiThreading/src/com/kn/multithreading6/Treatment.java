package com.kn.multithreading6;

public class Treatment implements Runnable {

	@Override
	synchronized public void run() {
		try {
			System.out.println("Treatment started for " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment in-progress for " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment completed for " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
