package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.CustomerRepo;
import com.example.Sardarleasingmanagement.entity.Customer;

@Controller
public class CustomerController {

	@Autowired
	private CustomerRepo customerRepo;
	
	@RequestMapping("/customer")
	public String showCustomerData(Model model) {

		List<Customer> customerList = customerRepo.findAll();
		model.addAttribute("customerList", customerList);
		
		return "customer";
	}
	

}
