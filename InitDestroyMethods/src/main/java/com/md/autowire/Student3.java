package com.md.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student3 {
	private int id;
	private String name;
	private String city;
	private int age;
	@Autowired// we can use @Autowired Annotation on top of property,constructor or setter methods
	@Qualifier("address2")
	private Address address;
	
	public Student3() {
		super();
	}

	
	
	public Student3(int id, String name, String city, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.address= address;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}


	
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", address=" + address
				+ "]";
	}



	public void welcome() {
		System.out.println("Inside Welcome Method");
	}
	
	public void bye() {
		System.out.println("Inside Bye Method");
	}
	
	

}
