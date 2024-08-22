package com.example.productcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productcrud.entity.Product;
import com.example.productcrud.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productrepo;

	@Override
	public List<Product> findAll() {
		
		return (List<Product>)productrepo.findAll(); 
	}

	@Override
	public Product save(Product product) {
		
		return productrepo.save(product);
	}

	@Override
	public Optional<Product> findById(Long pid) {
		
		return productrepo.findById(pid);
	}
	
	

}
