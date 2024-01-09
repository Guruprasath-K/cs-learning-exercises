package org.kodnest.hibernate_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	int laptopId;
	String laptopBrand;
	double cost;

	public Laptop() {
		super();
	}

	public Laptop(int laptopId, String laptopBrand, double cost) {
		super();
		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.cost = cost;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", cost=" + cost + "]";
	}

}
