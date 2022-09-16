package com.md.usingannotations;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

public class Student2 {
	
	private int id;
	private String name;
	
	
	public Student2() {
		super();
	}

	
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@PostConstruct
	public void start()  {
		System.out.println("Inside AfterPropertieset method");
	}

	@PreDestroy
	public void destroy() {
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
