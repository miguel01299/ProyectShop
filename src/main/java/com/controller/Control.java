package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.entity.Customer;
import com.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class Control {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Customer> customers = service.findAll();
		model.addAttribute("customer",customers);
		return "index";
	}
}
