package com.example.Sardarleasingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sardarleasingmanagement.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	

}
