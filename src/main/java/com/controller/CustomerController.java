package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.entity.Customer;
import com.service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// Esto es del video de youtube de 12/12
	@GetMapping("/")
	public String viewHomePage(Model model) {
	 return findPaginated(1, model);  
	}

	@GetMapping("/showNewCustomerForm")
	public String showNewCustomerForm(Model model) {
		// create model attribute to bind form data
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "new_customer";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		// save customer to database
		customerService.create(customer);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {

		// get customer from the service
		Customer customer = customerService.findById(id);

		// set customer as a model attribute to pre-populate the form
		model.addAttribute("customer", customer);
		return "update_customer";
	}

	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable(value = "id") int id) {
		// call delete customer method
		this.customerService.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
	    int pageSize = 5;

	    Page < Customer > page = customerService.findPaginated(pageNo, pageSize);
	    List < Customer > listCustomers = page.getContent();

	    model.addAttribute("currentPage", pageNo);
	    model.addAttribute("totalPages", page.getTotalPages());
	    model.addAttribute("totalItems", page.getTotalElements());
	    model.addAttribute("listCustomers", listCustomers);
	    return "index";
	}
}