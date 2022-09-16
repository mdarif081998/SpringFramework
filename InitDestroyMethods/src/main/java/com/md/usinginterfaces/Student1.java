package com.md.usinginterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student1 implements InitializingBean, DisposableBean{
	
	private int id;
	private String name;
	
	
	public Student1() {
		super();
	}

	
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside AfterPropertieset method");
	}

	public void destroy() throws Exception {
		System.out.println("Inside Destroy Method");
	}
	
	


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


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	
	
}
