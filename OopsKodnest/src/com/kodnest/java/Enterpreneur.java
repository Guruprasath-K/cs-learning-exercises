package com.kodnest.java;

public class Enterpreneur {
	int ownershipId;
	String organizationName;
	int sizeOfOrganization;

	void acquire() {
		System.out.println("Acquiring other organizations");
	}

	void raiseFund() {
		System.out.println("Fund Raised");
	}

	public Enterpreneur(int ownershipId, String organizationName, int sizeOfOrganization) {
		super();
		this.ownershipId = ownershipId;
		this.organizationName = organizationName;
		this.sizeOfOrganization = sizeOfOrganization;
	}

}
