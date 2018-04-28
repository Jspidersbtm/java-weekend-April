package com.google.employeeproject;

public class Employee {
	String name;
	int age;
	static String companyName = "Google";

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println(Employee.companyName); // Google
		Employee e = new Employee("XYZ", 30);
		System.out.println(e); // com.google.employeeproject.Employee@15db9742
		System.out.println(e.name); // XYZ
		System.out.println(e.age); // 30
		System.out.println(e.companyName); // Google
		Employee e1 = new Employee("ABC", 35);
		System.out.println(e1.companyName); // Google
		e1.companyName = "Amazon";
		System.out.println(Employee.companyName);

	}

}
