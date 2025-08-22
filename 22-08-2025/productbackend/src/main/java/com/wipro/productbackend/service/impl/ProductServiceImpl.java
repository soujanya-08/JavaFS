package com.wipro.productbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productbackend.entity.Product;
import com.wipro.productbackend.repo.ProductRepo;
import com.wipro.productbackend.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		
		return productRepo.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product> prodOpt= productRepo.findById(id);
		if(prodOpt.isPresent())
		{
			return prodOpt.get();
		}
		return null;
	}

	@Override
	public void save(Product p) {
		productRepo.save(p);
	}

	@Override
	public void deleteById(int id) {
		productRepo.deleteById(id);
	}

}
