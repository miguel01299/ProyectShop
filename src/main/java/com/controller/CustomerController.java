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

}