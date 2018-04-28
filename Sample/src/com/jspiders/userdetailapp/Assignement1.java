package com.jspiders.userdetailapp;

import java.util.Scanner;

public class Assignement1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Details name, age, phoneNumber");
		String name = s.nextLine();
		int age = s.nextInt();
		long phoneNo = s.nextLong();
		System.out.println("your name is " + name + " and your age is " + age + " and your phone number is " + phoneNo);
	}
}
