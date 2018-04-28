package com.jspiders.userdetailapp;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println("Enter your age");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("Enter your gender");
		String gender = s.nextLine();
		System.out.println("Enter city ");
		String city = s.nextLine();
		System.out.println("Enter your salary");
		double salary = s.nextDouble();
		System.out.println(name + " " + age + " " + gender + " " + city + " " + salary);
	}
}
