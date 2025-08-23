package com.example.productmgnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmgnt.entity.Product;
import com.example.productmgnt.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
@Tag(name="Product", description="Product Management APIs")
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@Operation(summary="save a product")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200",
					description="Saved successfully"),
			@ApiResponse(responseCode="404",
			description="Not found")	
	})
	@PostMapping
	void save(@RequestBody Product p) {
		productService.save(p);
	}
	@PutMapping
	void update(@RequestBody Product p) {
		productService.save(p);
	}
	@GetMapping
	List<Product> findAll() {
		return productService.findAll();
	}
	@GetMapping("/{id}")
	Product findById(@PathVariable int id) {
		return productService.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id) {
		productService.deleteById(id);
	}
	
	@GetMapping("/type")
	List<Product> findByProductMake(@RequestParam String productMakeType){
		return productService.findByProductMake(productMakeType);
	}
	@GetMapping("/typepath/{path}")
	List<Product> findByProductMake1(@PathVariable String path){
		return productService.findByProductMake(path);
	}
	@GetMapping("/typepath/{make}/{name}")
	List<Product> findByProductMakeAndProductNameOrderByProductNameDesc(@PathVariable String make,@PathVariable String name){
		return productService.findByProductMakeAndProductNameOrderByProductNameDesc(make, name);
	}
	
	@GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
	Page<Product> findAllPage(@PathVariable int pageNum, @PathVariable int pageSize, @PathVariable int sortOrder){
		Pageable p= null;
		if(sortOrder == 0) {
		p = PageRequest.of(pageNum, pageSize,Sort.by("price").ascending());
		}
		else {
			p = PageRequest.of(pageNum, pageSize,Sort.by("price").descending());
		}
		return productService.findAll(p);
		
	}

}
