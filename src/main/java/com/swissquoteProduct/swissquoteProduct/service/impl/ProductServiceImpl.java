package com.swissquoteProduct.swissquoteProduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swissquoteProduct.swissquoteProduct.model.Product;
import com.swissquoteProduct.swissquoteProduct.repository.ProductRepository;
import com.swissquoteProduct.swissquoteProduct.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return this.productRepository.saveAndFlush(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product resultProduct = this.productRepository.findByName(product.getName());
				
				if (resultProduct != null) {
					resultProduct.setName(product.getName());
					this.productRepository.saveAndFlush(resultProduct);
				
				} else {
					resultProduct = null;
				}
		
		return resultProduct;
	}

	@Override
	public Product findProduct(String name) {
		return this.productRepository.findByName(name);
	}

	@Override
	public Product findProductByValue(Integer value) {
		return this.productRepository.findByValue(value);
	}

	@Override
	public Product deleteProduct(String name) {
		this.productRepository.deleteByName(name);
		return null;
	}
	
}
