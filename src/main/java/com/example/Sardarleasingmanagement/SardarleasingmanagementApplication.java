package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Sardarleasingmanagement.dao.SUVRepo;
import com.example.Sardarleasingmanagement.entity.Suv;

@SpringBootApplication
public class SardarleasingmanagementApplication implements CommandLineRunner {

	
	@Autowired
	private SUVRepo suvRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SardarleasingmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Suv> suv = suvRepo.findAll();
		System.out.println(suv);
		
	}
	
	

}
