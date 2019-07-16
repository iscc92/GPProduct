package com.swissquoteProduct.swissquoteProduct.model;

import java.math.BigDecimal;

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

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String name;
	
	private String description;
	
	private BigDecimal value;
	
	public Product() {}
	
	public Product(String name, String description, BigDecimal value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}


}
