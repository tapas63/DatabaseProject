package com.example.Sardarleasingmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Sardarleasingmanagement.dao.LeasingOfficeRepo;
import com.example.Sardarleasingmanagement.dao.SUVRepo;
import com.example.Sardarleasingmanagement.dto.SearchDto;
import com.example.Sardarleasingmanagement.entity.LeasingOffice;
import com.example.Sardarleasingmanagement.entity.Suv;

@Controller
public class LeasingOfficeController {

	@Autowired
	private LeasingOfficeRepo leasingofficeRepo;

	@RequestMapping("/leasingoffice")
	public String showLeasingofficeData(Model model) {

		List<LeasingOffice> leasingofficeList = leasingofficeRepo.findAll();
		model.addAttribute("leasingofficeList", leasingofficeList);
		model.addAttribute("searchDTO", new SearchDto());

		return "leasingoffice";
	}

	@RequestMapping("/search")
    public String searchLeasingOffice(@RequestParam("officeId") long officeId,Model model) {
		System.out.println("printing office id : " + officeId);
    	Optional<LeasingOffice> findById = leasingofficeRepo.findById(officeId);
    	
    	if(findById.isPresent()) {
    		ArrayList<LeasingOffice> leasingOfficeList = new ArrayList<>();
    		
    		LeasingOffice leasingOffice = findById.get();
    		System.out.println("leasing office office id : " + leasingOffice);
    		
    		leasingOfficeList.add(leasingOffice);
    		
    		model.addAttribute("searchDTO", new SearchDto((int)officeId));
    		model.addAttribute("leasingofficeList", leasingOfficeList);
    	}
		return "leasingoffice";
	}

}
