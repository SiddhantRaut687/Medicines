package com.medicines.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicines")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s_no")
	private int serialNumber;
	
	@Column(name = "c_name")
	private String name;
	
	@Column(name = "c_batch_no")
	private String batchNumber;
	
	@Column(name = "d_expiry_date")
	private Date expiryDate;
	
	@Column(name = "n_balance_qty")
	private int balanceQuantity;
	
	@Column(name = "c_packaging")
	private String packaging;
	
	@Column(name = "c_unique_code")
	private String uniqueCode;
	
	@Column(name = "c_schemes")
	private String schemas;
	
	@Column(name = "n_mrp")
	private double mrp;
	
	@Column(name = "c_manufacturer")
	private String manufacturer;
	
	@Column(name = "hsn_code")
	private int hsnCode;

	public Medicine() {
		super();
	}

	public Medicine(int serialNumber, String name, String batchNumber, Date expiryDate, int balanceQuantity, String packaging,
			String uniqueCode, String schemas, double mrp, String manufacturer, int hsnCode) {
		super();
		this.serialNumber = serialNumber;
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

	public int getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
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
		return "Medicine [serialNumber=" + serialNumber + ", name=" + name + ", batchNumber=" + batchNumber
				+ ", expiryDate=" + expiryDate + ", balanceQuantity=" + balanceQuantity + ", packaging=" + packaging
				+ ", uniqueCode=" + uniqueCode + ", schemas=" + schemas + ", mrp=" + mrp + ", manufacturer="
				+ manufacturer + ", hsnCode=" + hsnCode + "]";
	}
}
