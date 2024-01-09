package org.kodnest.hibernate_mapping2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	int custId;
	String custName;
	int age;

	@OneToMany
	List<Product> products;

	public Customer() {
		super();
	}

	public Customer(int custId, String custName, int age, List<Product> products) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.age = age;
		this.products = products;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", age=" + age + ", products=" + products
				+ "]";
	}

}
