package com.jspiders.variableexample;

public class Student {
	String name;
	int rollNo;
	int age;

	void setValues(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		if (age > 18)
			this.age = age;
		else
			this.age = 0;
	}

	void display() {
		System.out.println(name + " " + age + " " + rollNo);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setValues("Mike", 1, 15);

		Student s1 = new Student();
		s1.setValues("Raj", 2, 18);

		s.display();
		s1.display();
	}

}
