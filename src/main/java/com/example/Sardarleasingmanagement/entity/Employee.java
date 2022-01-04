package com.example.Sardarleasingmanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee")
public class Employee {
	//EMP_ID, EMP_NAME, AGE, DOB, POSITION, DEPARTMENT, SALARY, JOIN_DATE, PINCODE
	@Id
	@Column(name = "EMP_ID")
	private long empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	@Column(name = "AGE")
	private int age;
	@Column(name = "DOB")
	@Temporal(TemporalType.DATE)
	private Date dob ;
	@Column(name = "POSITION")
	private String position;
	@Column(name = "DEPARTMENT")
	private String department;
	@Column(name = "SALARY")
	private int salary;
	@Column(name = "JOIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date joinDate ;
	@Column(name = "PINCODE")
	private long pincode;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", dob=" + dob + ", position="
				+ position + ", department=" + department + ", salary=" + salary + ", joinDate=" + joinDate
				+ ", pincode=" + pincode + "]";
	}
	
}
