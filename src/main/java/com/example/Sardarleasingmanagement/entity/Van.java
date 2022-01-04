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
@Table(name = "VAN")
public class Van {
	
	//SUV_ID, MODEL, PINCODE, OFF_ID, CUSTOMER_ID
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VAN_ID")
	private long vanId;
	
	@Column(name = "MODEL")
	private String model;
	@Column(name = "PINCODE")
	private int pincode;
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	
	@ManyToOne
	@JoinColumn(name="OFF_ID")
	private LeasingOffice leasingOffice;
	
	public LeasingOffice getLeasingOffice() {
		return leasingOffice;
	}
	public void setLeasingOffice(LeasingOffice leasingOffice) {
		this.leasingOffice = leasingOffice;
	}
	public long getVanId() {
		return vanId;
	}
	public void setVanId(long vanId) {
		this.vanId = vanId;
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

	
	
	

}
