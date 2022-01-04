package com.example.Sardarleasingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sardarleasingmanagement.entity.Employee;
import com.example.Sardarleasingmanagement.entity.PickupTruck;

public interface PickupTruckRepo extends JpaRepository<PickupTruck, Long> {
	

}
