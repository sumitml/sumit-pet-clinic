package com.sk.sumitpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sk.sumitpetclinic.services.OwnerService;

@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}



	@RequestMapping({"/owners","/owners/index","/owners/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		return "owners/index";
	}
	
	@RequestMapping({"owners/find","oups"})
	public String findOwners() {
		return "NotImplemented";
	}
	
	
	

}
