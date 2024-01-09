package com.kn.interface1;

public class MechStudent implements Student {

	@Override
	public void study() {
		System.out.println("Studying AutoCAD");
	}

	@Override
	public void doProject() {
		System.out.println("Working Robotics Project");
	}

}
