package com.example.productcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.productcrud.entity.Product;

@Service
public interface ProductService {
	
	List<Product> findAll();
	
	Product  save(Product product);
	
	Optional<Product> findById(Long pid);
	
	
	

}
