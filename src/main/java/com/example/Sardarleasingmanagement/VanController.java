package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.VanRepo;
import com.example.Sardarleasingmanagement.entity.Van;

@Controller
public class VanController {

	@Autowired
	private VanRepo vanRepo;
	
	@RequestMapping("/van")
	public String showVanData(Model model) {

		List<Van> vanList = vanRepo.findAll();
		model.addAttribute("vanList", vanList);
		
		return "van";
	}
	

}
