package com.mr.tostringoverrideexampleaddress;

public class Address {
	int doorNo;
	String street;
	String city;
	int pinCode;

	public Address(int doorNo, String street, String city, int pinCode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}

	public static void main(String[] args) {
		Address a = new Address(10, "BTM", "Bangalore", 5446468);
		System.out.println(a);// Address [doorNo=10, street=BTM, city=Bangalore,
								// pinCode=5446468]
		Address a1 = new Address(11, "Panvel", "Mumbai", 544788);
		System.out.println(a1);// Address [doorNo=11, street=Panvel,
								// city=Mumbai, pinCode=544788]
	}
}