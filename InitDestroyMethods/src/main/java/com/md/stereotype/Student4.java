package com.md.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student4 {
	//@Value("1") // or using SPEL
	@Value("#{1*5+1}")
	private int id;
	@Value("#{new java.lang.String('MD ARIF')}")
	private String name;
	@Value("Kalaburagi")
	private String city;
	//@Value("#{T(java.lang.Math).sqrt(625)}") // this is the way of invoking static methods from a class
	@Value("#{T(java.lang.Math).PI}") // this is the way of assigning Constant static variables from a class
	private int age;
	@Value("#{10>4}")
	private boolean isActive;
	@Autowired
	@Value("#{add1}")
	private Address address;
	
	public Student4() {
		super();
	}

	
	
	public Student4(int id, String name, String city, int age, Address address) {
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

