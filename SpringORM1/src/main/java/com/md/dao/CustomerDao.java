package com.md.dao;

import java.util.List;

import com.md.entity.Customer;

public interface CustomerDao {

	int insert(Customer customer);
	
	void update(Customer customer);
	
	void delete(int id);
	
	Customer find(int id);
	
	List<Customer> findAll();
}
