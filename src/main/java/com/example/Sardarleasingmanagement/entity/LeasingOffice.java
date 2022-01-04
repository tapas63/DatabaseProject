package com.example.Sardarleasingmanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LEASING_OFFICE")
public class LeasingOffice { //one
	
	//OFF_ID, EMP_COUNT, RID, PINCODE
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OFF_ID")
	private long offid;
	
	@Column(name = "EMP_COUNT")
	private String empcount;
	@Column(name = "RID")
	private int rid;
	@Column(name = "PINCODE")
	private int pincode;
	
    @OneToMany(mappedBy = "leasingOffice")
	private List<Van> vans;
    @OneToMany(mappedBy = "leasingOffice")
	private List<Sedan> sedanes;
    @OneToMany(mappedBy = "leasingOffice")
	private List<Suv> suv;
    @OneToMany(mappedBy = "leasingOffice")
	private List<PickupTruck> pickupTrucks;
	
	
	public List<Van> getVans() {
		return vans;
	}
	public void setVans(List<Van> vans) {
		this.vans = vans;
	}
	public List<Sedan> getSedanes() {
		return sedanes;
	}
	public void setSedanes(List<Sedan> sedanes) {
		this.sedanes = sedanes;
	}
	public List<Suv> getSuv() {
		return suv;
	}
	public void setSuv(List<Suv> suv) {
		this.suv = suv;
	}
	public List<PickupTruck> getPickupTrucks() {
		return pickupTrucks;
	}
	public void setPickupTrucks(List<PickupTruck> pickupTrucks) {
		this.pickupTrucks = pickupTrucks;
	}
	
	public long getOffid() {
		return offid;
	}
	public void setOffid(long offid) {
		this.offid = offid;
	}
	public String getEmpcount() {
		return empcount;
	}
	public void setEmpcount(String empcount) {
		this.empcount = empcount;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "LeasingOffice [offid=" + offid + ", empcount=" + empcount + ", rid=" + rid + ", pincode=" + pincode
				+ ", vans=" + vans + ", sedanes=" + sedanes + ", suv=" + suv + ", pickupTrucks=" + pickupTrucks + "]";
	}
	
	
	
	

}
