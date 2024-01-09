package com.kn.multithreading7;

public class Tom implements Runnable {

	Hospital h;

	@Override
	public void run() {
		h.treatTom();
	}

	public Tom(Hospital h) {
		this.h = h;
	}

}
