package com.wipro.productbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productbackend.entity.Product;
import com.wipro.productbackend.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping
	List<Product> findAll()
	{
		return productService.findAll();
	}
	@GetMapping("/{id}")
	Product findById(@PathVariable int id)
	{
		return productService.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		productService.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody Product prod)
	{
		productService.save(prod);
		
	}
	
	@PutMapping
	void update(@RequestBody Product prod)
	{
		System.out.println("edit"+ prod);
		productService.save(prod);
		
	}

}
