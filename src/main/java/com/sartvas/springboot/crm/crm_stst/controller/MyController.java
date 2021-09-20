package com.sartvas.springboot.crm.crm_stst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Main page");
		return "home";
	}

}
