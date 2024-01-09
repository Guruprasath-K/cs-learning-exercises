package com.kn.polymorphism3;

public class DatabaseEngineer extends SoftwareEngineer {

	@Override
	public void attendMeeting() {
		System.out.println("Meeting Attended by Database Engineer");
	}

	public void doDatabaseProject() {
		System.out.println("Database Project Started...");
	}

	public void learnSQL() {
		System.out.println("Started learning SQL");
	}

}
