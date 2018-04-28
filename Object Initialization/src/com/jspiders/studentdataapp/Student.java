package com.jspiders.studentdataapp;

public class Student {
	String name = "Alpha";
	int age = 25;
	String collegeName = "XYIT";

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name + " " + s.age + " " + s.collegeName);
		
		Student s1 = new Student();
		System.out.println(s1.name + " " + s1.age + " " + s1.collegeName);
		
		Student s2 = new Student();
		System.out.println(s2.name + " " + s2.age + " " + s2.collegeName);
		
	}

}
