package com.example.productmgnt.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productmgnt.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	List<Product> findByProductMake(String productMake);
	List<Product> findByProductMakeAndProductNameOrderByProductNameDesc(String productMake, String productName);
	Page<Product> findAll(Pageable p);
}
