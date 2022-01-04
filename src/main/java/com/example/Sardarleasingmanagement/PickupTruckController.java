package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.PickupTruckRepo;
import com.example.Sardarleasingmanagement.entity.PickupTruck;

@Controller
public class PickupTruckController {

	@Autowired
	private PickupTruckRepo pickuptruckRepo;
	
	@RequestMapping("/pickuptruck")
	public String showPickupTruckData(Model model) {

		List<PickupTruck> pickuptruckList = pickuptruckRepo.findAll();
		model.addAttribute("pickuptruckList", pickuptruckList);
		
		return "pickuptruck";
	}
	

}
