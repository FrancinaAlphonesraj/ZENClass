package com.example.productcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.productcrud.entity.Product;
import com.example.productcrud.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productserv;
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		return "Home";
		
	}
	
	@GetMapping("/productform")
	
	public String productForm(Model model) {
		
		model.addAttribute("product", new Product());
		return "ProductForm";
		
	}
	
	@GetMapping("/productList")
	
	public String productList(Model model) {
		
		model.addAttribute("products", productserv.findAll());
		
		return "ProductList";
		
	}
	
	@PostMapping("/create")
	public String Save(@ModelAttribute("product") Product product) {
		
		productserv.save(product);
		return "redirect:/productList";
		
	}
	
	
	

}
