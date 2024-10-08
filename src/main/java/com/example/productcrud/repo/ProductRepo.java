package com.example.productcrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productcrud.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
