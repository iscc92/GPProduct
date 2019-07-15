package com.swissquoteProduct.swissquoteProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swissquoteProduct.swissquoteProduct.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
	Product findByValue(Integer value);
	void deleteByName(String name);
}
