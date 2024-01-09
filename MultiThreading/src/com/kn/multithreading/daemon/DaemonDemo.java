package com.kn.multithreading.daemon;

public class DaemonDemo {

	public static void main(String[] args) {

		// Instantiate Thread Objects
		TypingCode t1 = new TypingCode();
		SavingCode t2 = new SavingCode();
		CompilingCode t3 = new CompilingCode();

		// Set Thread as Daemon Thread
		t2.setDaemon(true);
		t3.setDaemon(true);

		// Start all threads
		t1.start();
		t2.start();
		t3.start();

	}

}
