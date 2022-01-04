package com.example.Sardarleasingmanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SARDAR_MOTOR_LEASING_AND_CO")
public class SardarMotorLeasingCo {
	//RID, EMP_ID, CHAIRMAN, PINCODE
	@Id
	@Column(name = "RID")
	private long rid;
	
	@Column(name = "EMP_ID")
	private String empid;
	@Column(name = "CHAIRMAN")
	private String chairman;
	@Column(name = "PINCODE")
	private long pincode;
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getChairman() {
		return chairman;
	}
	public void setChairman(String chairman) {
		this.chairman = chairman;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "SardarMotorLeasingCo [rid=" + rid + ", empid=" + empid + ", chairman=" + chairman + ", pincode="
				+ pincode + "]";
	}
	
	
}
