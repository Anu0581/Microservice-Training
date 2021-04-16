package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.repo.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepo prodRepo;
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return prodRepo.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProductsById(@PathVariable Long id){
		return prodRepo.findById(id);
		
	}
}
