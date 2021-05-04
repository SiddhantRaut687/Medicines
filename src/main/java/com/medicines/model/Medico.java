package com.medicines.model;

import java.util.Date;

public class Medico {
    private String name;
	
	private String batchNumber;
	
	private Date expiryDate;
	
	private int balanceQuantity;
	
	private String packaging;
	
	private String uniqueCode;
	
	private String schemas;
	
	private double mrp;
	
	private String manufacturer;
	
	private int hsnCode;

	public Medico(String name, String batchNumber, Date expiryDate, int balanceQuantity, String packaging,
			String uniqueCode, String schemas, double mrp, String manufacturer, int hsnCode) {
		super();
		this.name = name;
		this.batchNumber = batchNumber;
		this.expiryDate = expiryDate;
		this.balanceQuantity = balanceQuantity;
		this.packaging = packaging;
		this.uniqueCode = uniqueCode;
		this.schemas = schemas;
		this.mrp = mrp;
		this.manufacturer = manufacturer;
		this.hsnCode = hsnCode;
	}

	public Medico() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getBalanceQuantity() {
		return balanceQuantity;
	}

	public void setBalanceQuantity(int balanceQuantity) {
		this.balanceQuantity = balanceQuantity;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public String getSchemas() {
		return schemas;
	}

	public void setSchemas(String schemas) {
		this.schemas = schemas;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(int hsnCode) {
		this.hsnCode = hsnCode;
	}

	@Override
	public String toString() {
		return "Medico [name=" + name + ", batchNumber=" + batchNumber + ", expiryDate=" + expiryDate
				+ ", balanceQuantity=" + balanceQuantity + ", packaging=" + packaging + ", uniqueCode=" + uniqueCode
				+ ", schemas=" + schemas + ", mrp=" + mrp + ", manufacturer=" + manufacturer + ", hsnCode=" + hsnCode
				+ "]";
	}
}
