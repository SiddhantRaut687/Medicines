package com.medicines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "c_unique_code")
	private String uniqueCode;
	
	@Column(name = "n_quantity")
	private int quantity;
	
	@Column(name = "c_name")
	private String name;
	
	public Order() {
		super();
	}

	public Order(String uniqueCode, int quantity, String name) {
		super();
		this.uniqueCode = uniqueCode;
		this.quantity = quantity;
		this.name = name;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", uniqueCode=" + uniqueCode + ", quantity=" + quantity + ", name=" + name
				+ "]";
	}
	
}
