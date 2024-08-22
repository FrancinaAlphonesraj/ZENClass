package com.example.productcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="productcrud")

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	
	@Column(name ="p_name", nullable = false)
	private String productname;
	
	@Column(name="p_price")
	private double price;
	
	@Column(name="p_category")
	private String Category;
}
