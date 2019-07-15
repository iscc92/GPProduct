package com.swissquoteProduct.swissquoteProduct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Product")
@Data

public class Product {
	
	Product() {}
	
	public Product(String name, String description, Integer value) {
		this.name = name;
		this.description = description;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String name;
	
	private String description;
	
	private Integer value;
}
