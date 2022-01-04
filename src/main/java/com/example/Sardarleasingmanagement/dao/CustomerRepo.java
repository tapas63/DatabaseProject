package com.example.Sardarleasingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sardarleasingmanagement.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
	

}
