package com.car.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cars")

public class Car {
	@Id
	@Column(name = "CarNo")
	private String carNo;
	
	@Column(name = "Manufacture")
	private String manufacturer;
	
	@Column(name = "Model")
	private String model;
	
	@Column(name = "KmsRan")
	private int kmsran;
	
	@Column(name = "PriceExpected")
	private int priceexcepted;
	
	@Column(name = "NoOfOwners")
	private int noofowners;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKmsran() {
		return kmsran;
	}

	public void setKmsran(int kmsran) {
		this.kmsran = kmsran;
	}

	public int getPriceexcepted() {
		return priceexcepted;
	}

	public void setPriceexcepted(int priceexcepted) {
		this.priceexcepted = priceexcepted;
	}

	public int getNoofowners() {
		return noofowners;
	}

	public void setNoofowners(int noofowners) {
		this.noofowners = noofowners;
	}

}
