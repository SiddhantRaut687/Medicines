package com.medicines.model;

public class OrderRequest {
	
	private String uniqueCode;
	
	private int quantity;
	
	private String name;
	
	public OrderRequest() {
		super();
	}

	public OrderRequest(String uniqueCode, int quantity, String name) {
		super();
		this.uniqueCode = uniqueCode;
		this.quantity = quantity;
		this.name = name;
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
		return "OrderRequest [uniqueCode=" + uniqueCode + ", quantity=" + quantity + ", name=" + name + "]";
	}
	
}
