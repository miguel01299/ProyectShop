package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.entity.Card;
import com.entity.Product;
import com.entity.Product;
import com.service.CardService;
import com.service.ProductService;
import com.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/api/product") // http://localhost:8080/api/product
public class ProductController {

	@Autowired
	private ProductService productService;
	private CardService cardService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1, model);

	}

	@GetMapping("/showNewProductForm")
	public String showNewProductForm(Model model) {
		// create model attribute to bind form data
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}

	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product) {
		// save product to database
		product.setWeight(0);
		productService.create(product);
		return "redirect:/api/product/";
	}

	@GetMapping("/buyProduct/{id}")
	public String buyProduct(@PathVariable(value = "id") int id, Model model) {
		// save product to database
		Product product = productService.findById(id);
		if (product.getStock() > 1) {
			product.setStock(product.getStock() - 1);
			productService.update(product);
		} else {
			productService.delete(id);
		}
		return "redirect:/api/product/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {

		// get product from the service
		Product product = productService.findById(id);

		// set product as a model attribute to pre-populate the form
		model.addAttribute("product", product);
		return "update_product";
	}

	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable(value = "id") int id) {
		// call delete product method
		this.productService.delete(id);
		return "redirect:/";
	}

	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		int pageSize = 5;
		Page<Product> page = productService.findPaginated(pageNo, pageSize);
		List<Product> listProducts = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
}
