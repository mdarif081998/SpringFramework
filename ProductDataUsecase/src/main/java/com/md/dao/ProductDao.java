package com.md.dao;

import java.util.List;

import com.md.entity.Product;

public interface ProductDao {
	
	int Insert(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product getPreoduct(int id);
	
	List<Product> getAllProducts();

}
