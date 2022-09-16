package com.md.dao;

import java.util.List;

import com.md.entity.Employee;

public interface EmployeeDao {
	
	int insert(Employee emp);
	
	int update(Employee emp);
	
	int delete(int id);
	
	Employee readById(int id);
	
	List<Employee> readAll();

}
