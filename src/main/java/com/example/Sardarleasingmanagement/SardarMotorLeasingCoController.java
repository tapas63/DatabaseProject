package com.example.Sardarleasingmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sardarleasingmanagement.dao.SardarMotorLeasingCoRepo;
import com.example.Sardarleasingmanagement.entity.SardarMotorLeasingCo;

@Controller
public class SardarMotorLeasingCoController {

	@Autowired
	private SardarMotorLeasingCoRepo sardarmotorleasingcoRepo;
	
	@RequestMapping("/sardarleasingmotorco")
	public String showSardarMotorLeasingCoData(Model model) {

		List<SardarMotorLeasingCo> sardarmotorleasingcoList = sardarmotorleasingcoRepo.findAll();
		model.addAttribute("sardarmotorleasingcoList", sardarmotorleasingcoList);
		
		return "sardarleasingmotorco";
	}
	

}
