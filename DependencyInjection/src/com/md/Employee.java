package com.md;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		System.out.println("default cons");
	}

	public Employee(int id) {
		System.out.println("Id Constructor");
		this.id = id;
	}

	public Employee(String name) {
		System.out.println("Name Constructor");
		this.name = name;
	}

	public Employee(int id, String name) {
		System.out.println("Id and Name Constructor");
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("id Setter");
		this.id = id;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		System.out.println("Name Setter");
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("To String Method");
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}