package com.controller;

import javax.persistence.PersistenceException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exception.CommonException;
import com.registration.CustomerRegistration;
import com.service.ICustomerService;

@Controller
@RequestMapping("/registration")
public class CustomerRegistrationController {
	private ICustomerService customerService;

	public CustomerRegistrationController(ICustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@ModelAttribute("customer")
	public CustomerRegistration CustomerRegistration() {
		return new CustomerRegistration();
	}

	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}

	@PostMapping
	public String registerCustomerAccount(@ModelAttribute("customer") CustomerRegistration registration) {
			customerService.save(registration);
			return "redirect:/registration?success";
	}
	
	@ExceptionHandler(value=CommonException.class)
	public ModelAndView defaultErrorHandler(CommonException e) {
		ModelAndView model= new ModelAndView();
		model.addObject("exception", e.getMessage());
		model.setViewName("error");
		return model;
	}

}
