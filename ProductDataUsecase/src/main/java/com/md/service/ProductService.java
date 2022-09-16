package com.md.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.md.dao.ProductDao;
import com.md.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao dao;
	
	
	//@Transactional annotation is used to provide permission for Safe data Editing into the data base. use of this
	//annotation is recommended inside service class as we can call multiple methods to connect in one transaction.
	@Transactional
	public int InsertProduct(Product product) {
		return dao.Insert(product);
	}
	
	@Transactional
	public void updateProduct(Product product) {
		dao.update(product);
	}
	
	@Transactional
	public void deleteProduct(int id) {
		Product product = dao.getPreoduct(id);
		dao.delete(product);
	}
	
	@Transactional
	public Product getProductById(int id) {
		return dao.getPreoduct(id);
	}
	
	@Transactional
	public List<Product> getAllProducts(){
		return dao.getAllProducts();
	}
	
	

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	
	

}
