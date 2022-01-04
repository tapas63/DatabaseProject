package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.EmployeeRepo;
import com.example.Sardarleasingmanagement.entity.Employee;
import com.example.Sardarleasingmanagement.entity.Suv;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepo empRepo;
	
	@RequestMapping("/emp")
	public String showSuvData(Model model) {

		List<Employee> empList = empRepo.findAll();
		model.addAttribute("empList", empList);
		
		return "emp";
	}
	

}
