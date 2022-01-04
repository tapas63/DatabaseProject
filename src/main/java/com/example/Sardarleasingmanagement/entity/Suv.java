package com.example.Sardarleasingmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUV")
public class Suv {
	
	//SUV_ID, MODEL, PINCODE, OFF_ID, CUSTOMER_ID
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUV_ID")
	private long suvId;
	
	@Column(name = "MODEL")
	private String model;
	@Column(name = "PINCODE")
	private int pincode;
	
	@ManyToOne
	@JoinColumn(name="OFF_ID")
	private LeasingOffice leasingOffice;
	
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	public long getSuvId() {
		return suvId;
	}
	public void setSuvId(long suvId) {
		this.suvId = suvId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LeasingOffice getLeasingOffice() {
		return leasingOffice;
	}
	public void setLeasingOffice(LeasingOffice leasingOffice) {
		this.leasingOffice = leasingOffice;
	}
	
	

}
