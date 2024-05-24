package com.htech.product.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int expdate;
	
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	
	List < ProductDetails > ProductDetails_db;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExpdate() {
		return expdate;
	}

	public void setExpdate(int expdate) {
		this.expdate = expdate;
	}

	public List<ProductDetails> getProductDetails_db() {
		return ProductDetails_db;
	}

	public void setProductDetails_db(List<ProductDetails> productDetails_db) {
		ProductDetails_db = productDetails_db;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", expdate=" + expdate + ", ProductDetails_db="
				+ ProductDetails_db + "]";
	}
	
	
	
}