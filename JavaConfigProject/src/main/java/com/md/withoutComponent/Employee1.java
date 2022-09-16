package com.md.withoutComponent;

import org.springframework.beans.factory.annotation.Value;

public class Employee1 {
	@Value("2")
	private int id;
	@Value("Niranjan")
	private String name;

	public Employee1() {
		super();
	}

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
