package com.mr.associationexampleaddress;

public class Address {
	int doorNo;
	String street;
	String city;
	int pincode;

	public String toString() {
		return this.doorNo + " " + this.street + " " + this.city + " " + this.pincode;
	}

}
