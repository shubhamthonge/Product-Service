package com.htech.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htech.product.dto.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
