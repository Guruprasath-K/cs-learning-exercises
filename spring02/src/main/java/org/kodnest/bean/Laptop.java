package org.kodnest.bean;

public class Laptop {

	int serialNumber;
	String manufacturer;
	double cost;

	public Laptop() {
		super();
		System.out.println("No-arg constructor");
	}

	public Laptop(int serialNumber, String manufacturer, double cost) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
		System.out.println("Parameterized constructor");
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
		System.out.println("---> Serial Number");
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		System.out.println("---> Manufacturer");
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("---> Cost");
	}

	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}

}
