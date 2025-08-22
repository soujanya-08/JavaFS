package com.wipro.productbackend.service;

import java.util.List;

import com.wipro.productbackend.entity.Product;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	void save(Product p);
	void deleteById(int id);

}
