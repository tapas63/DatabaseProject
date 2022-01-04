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
@Table(name = "CUSTOMER")
public class Customer { //many
	
	//CUSTOMER_ID, NAME, PINCODE, GENDER, VEHICHLE_TYPE, USERNAME, PWD, OFF_ID
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private long customerId;
	
	@Column(name = "NAME")
	private String name;
	@Column(name = "PINCODE")
	private int pincode;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "VEHICHLE_TYPE")
	private String vehichletype;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PWD")
	private String pwd;
	
	
//	@Column(name = "OFF_ID")
//	private int offId;
	
	@ManyToOne
	@JoinColumn(name="OFF_ID")
	private LeasingOffice leasingOffice;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getVehichletype() {
		return vehichletype;
	}
	public void setVehichletype(String vehichletype) {
		this.vehichletype = vehichletype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public LeasingOffice getLeasingOffice() {
		return leasingOffice;
	}
	public void setLeasingOffice(LeasingOffice leasingOffice) {
		this.leasingOffice = leasingOffice;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", pincode=" + pincode + ", gender=" + gender
				+ ", vehichletype=" + vehichletype + ", username=" + username + ", pwd=" + pwd + ", leasingOffice="
				+ leasingOffice + "]";
	}

	

	
	
	

}
