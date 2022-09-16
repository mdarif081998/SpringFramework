package com.md;

public class Address {

	private String locality;
	private String city;
	private int pinCode;
	
	public Address() {
		super();
	}

	public Address(String locality, String city, int pinCode) {
		super();
		this.locality = locality;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [locality=" + locality + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
