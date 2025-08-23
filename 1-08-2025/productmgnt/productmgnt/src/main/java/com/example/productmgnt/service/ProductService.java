package com.example.productmgnt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.productmgnt.entity.Product;


public interface ProductService {
	void save(Product p);//insert and update
	List<Product> findAll();//select * will return list
	Product findById(int id);
	void deleteById(int id);
	List<Product> findByProductMake(String productMake);
	List<Product> findByProductMakeAndProductNameOrderByProductNameDesc(String productMake, String productName);
	Page<Product> findAll(Pageable p);
}
