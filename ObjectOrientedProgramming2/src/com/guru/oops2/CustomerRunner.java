package com.guru.oops2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Bangalore", "500000");
		Customer customer = new Customer("Guru", homeAddress);

		Address workAddress = new Address("line 1 work", "Chennai", "500000");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}
}
