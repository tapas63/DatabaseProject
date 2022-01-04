package com.example.Sardarleasingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sardarleasingmanagement.entity.Sedan;

public interface SedanRepo extends JpaRepository<Sedan, Long> {
	

}
