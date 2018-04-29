package com.mr.associationexampleaddress;

public class Office {
	String name;
	long phoneNo;
	Address address;

	public String toString() {
		return this.name + " " + this.phoneNo + " " + this.address;
	}

	public static void main(String[] args) {
		Office o = new Office();
		o.name = "Jspiders";
		o.phoneNo = 46579879L;
		o.address = new Address();
		o.address.doorNo = 20;
		o.address.street = "BTM";
		o.address.city = "Bangalore";
		o.address.pincode = 560072;
		System.out.println(o); // Jspiders 46579879 20 BTM Bangalore 560072
		System.out.println(o.address); // 20 BTM Bangalore 560072
		Student s = new Student();
		s.name = "Charlie";
		s.id = 10;
		s.address = new Address();
		System.out.println(s); // Charlie 10 0 null null 0 , 
	}
}
