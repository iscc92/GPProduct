package com.swissquoteProduct.swissquoteProduct.service;

import com.swissquoteProduct.swissquoteProduct.model.Product;

public interface ProductService {
	
	Product saveProduct(Product product);
	Product updateProduct(Product product);
	Product findProduct(String name);
	Product deleteProduct(String name);

}