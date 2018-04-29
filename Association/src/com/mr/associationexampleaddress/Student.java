package com.mr.associationexampleaddress;

public class Student {
	String name;
	int id;
	Address address;

	public String toString() {
		return this.name + " " + this.id + " " + this.address;
	}

}
