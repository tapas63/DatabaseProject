package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.SUVRepo;
import com.example.Sardarleasingmanagement.entity.Suv;

@Controller
public class SuvController {

	@Autowired
	private SUVRepo suvRepo;
	
	@RequestMapping("/suv")
	public String showSuvData(Model model) {

		List<Suv> suvList = suvRepo.findAll();
		model.addAttribute("suvList", suvList);
		
		return "suv";
	}
	

}
