package com.kn.multithreading.daemon;

public class SavingCode extends Thread {

	@Override
	public void run() {
		for (;;) { // Infinite Loop
			System.out.println("Saving Code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
