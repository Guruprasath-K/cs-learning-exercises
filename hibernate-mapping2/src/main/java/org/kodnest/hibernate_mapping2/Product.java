package org.kodnest.hibernate_mapping2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	int prodId;
	String prodName;
	double cost;

	@ManyToOne
	Customer customer;

	public Product() {
		super();
	}

	public Product(int prodId, String prodName, double cost, Customer customer) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.cost = cost;
		this.customer = customer;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", cost=" + cost + ", customer=" + customer
				+ "]";
	}

}
