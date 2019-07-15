package com.swissquoteProduct.swissquoteProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swissquoteProduct.swissquoteProduct.model.Product;
import com.swissquoteProduct.swissquoteProduct.model.ProductRequest;
import com.swissquoteProduct.swissquoteProduct.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/product/{name}", method = RequestMethod.GET)
	public Product findProduct(@PathVariable String name) {
		return this.productService.findProduct(name);
	}
	
	@RequestMapping(value = "/product/value/{value}", method = RequestMethod.GET)
	public Product findProductByValue(@PathVariable Integer value) {
		return this.productService.findProductByValue(value);
	}	
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product saveProduct(@RequestBody ProductRequest productRequest) {
		Product product = new Product(productRequest.getName(), productRequest.getDescription(), productRequest.getValue());
		return this.productService.saveProduct(product);
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody ProductRequest productRequest) {
		Product product = new Product(productRequest.getName(), productRequest.getDescription(), productRequest.getValue());
		return this.productService.updateProduct(product);
	}
	
	@RequestMapping(value = "/product/{name}", method = RequestMethod.DELETE)
	public Product deleteProduct(@PathVariable String name) {
		this.productService.deleteProduct(name);
		return null;
	}
}