package com.md.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.md.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public int Insert(Product product) {
		
		return (Integer)hibernateTemplate.save(product);
	}

	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	public Product getPreoduct(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	public List<Product> getAllProducts() {
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
