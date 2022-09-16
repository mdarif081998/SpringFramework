package com.md;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String> dependents;
	private Set<String> friends;
	private Map<String,String> contact;
	private Address address;
	
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

	public List<String> getDependents() {
		return dependents;
	}

	public void setDependents(List<String> dependents) {
		this.dependents = dependents;
	}

	public Set<String> getFriends() {
		return friends;
	}

	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getContact() {
		return contact;
	}

	public void setContact(Map<String, String> contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dependents=" + dependents + ", friends=" + friends
				+ ", contact=" + contact + ", address=" + address + "]";
	}

	

	
	
}