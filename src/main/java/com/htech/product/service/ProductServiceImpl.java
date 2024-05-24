package com.htech.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htech.product.Repository.ProductRepository;
import com.htech.product.dto.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllActiveProduct() {
		System.out.println("inside ProductServiceImpl getAll");
		List<Product> p1=productRepository.findAll();
		System.out.println("list of product"+p1);
		return p1;
	}

}
