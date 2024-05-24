package com.htech.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htech.product.dto.Product;
import com.htech.product.service.ProductServiceImpl;

@RestController
@RequestMapping("/product/v1")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/healthcheck")
	public String heathcheck()
	{
	return "Product Service UP";	
	}
	
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllActiveProduct(@RequestBody Product p) {
		System.out.println("inside ProductController getAllProduct");
		List<Product> p1=productServiceImpl.getAllActiveProduct();
		return p1;
	}

}
