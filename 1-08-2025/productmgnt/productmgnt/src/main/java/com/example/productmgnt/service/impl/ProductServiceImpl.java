package com.example.productmgnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.productmgnt.entity.Product;
import com.example.productmgnt.repo.ProductRepo;
import com.example.productmgnt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productrepo;
	@Override
	public void save(Product p) {
		productrepo.save(p);
		
	}

	@Override
	public List<Product> findAll() {
		
		return productrepo.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product> product=productrepo.findById(id);
		if(!product.isEmpty())
		{
			return product.get();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		productrepo.deleteById(id);
		
	}
	public List<Product> findByProductMake(String productMake){
		return productrepo.findByProductMake(productMake);
	}

	@Override
	public List<Product> findByProductMakeAndProductNameOrderByProductNameDesc(String productMake, String productName) {
		
		return productrepo.findByProductMakeAndProductNameOrderByProductNameDesc(productMake, productName);
	}

	@Override
	public Page<Product> findAll(Pageable p) {
		
		return productrepo.findAll(p);
	}
	
}
