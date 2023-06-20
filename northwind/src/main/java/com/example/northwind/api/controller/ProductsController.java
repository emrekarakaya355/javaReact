package com.example.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return productService.getAll();
	}
	
}
