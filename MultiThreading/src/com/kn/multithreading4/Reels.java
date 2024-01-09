package com.kn.multithreading4;

public class Reels extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Creating Reels...");
			Thread.sleep(2000);

			System.out.println("Uploading Reels");
			Thread.sleep(2000);

			System.out.println("Sharing Reels");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
