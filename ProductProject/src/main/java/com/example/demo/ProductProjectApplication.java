package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Product;
import com.example.demo.repo.ProductRepo;

@SpringBootApplication
public class ProductProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductProjectApplication.class, args);
	}
	
	@Autowired
	ProductRepo productRepo;
	 
	@PostConstruct
	public void insertData() {
		//Product prod = Product.builder().name("Shoes").category("air").price(11.1).build();
		productRepo.save(new Product("Shoes","air",1.02,new Date()));
		productRepo.save(new Product("Shirt","Plain",100.02,new Date()));
	}

}
