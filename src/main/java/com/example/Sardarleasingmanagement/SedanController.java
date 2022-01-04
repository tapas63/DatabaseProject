package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.SedanRepo;
import com.example.Sardarleasingmanagement.entity.Sedan;

@Controller
public class SedanController {

	@Autowired
	private SedanRepo sedanRepo;
	
	@RequestMapping("/sedan")
	public String showSedanData(Model model) {

		List<Sedan> sedanList = sedanRepo.findAll();
		model.addAttribute("sedanList", sedanList);
		
		return "sedan";
	}
	

}
