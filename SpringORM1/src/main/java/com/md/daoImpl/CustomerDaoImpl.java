package com.md.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.md.dao.CustomerDao;
import com.md.entity.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Customer customer) {
		
		return (Integer) hibernateTemplate.save(customer);
	}

	@Transactional
	public void update(Customer customer) {
		hibernateTemplate.update(customer);
		 return;
	}

	@Transactional
	public void delete(int id) {
		Customer cust=find(id);
		  hibernateTemplate.delete(cust);
		  return;
	}

	@Transactional
	public Customer find(int id) {
		
		return hibernateTemplate.get(Customer.class, id);
	}

	@Transactional
	public List<Customer> findAll() {
		
		return hibernateTemplate.loadAll(Customer.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
