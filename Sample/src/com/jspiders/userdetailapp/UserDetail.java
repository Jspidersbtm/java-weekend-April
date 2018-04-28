package com.jspiders.userdetailapp;

import java.util.Scanner;

public class UserDetail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = "Mike";
		System.out.println("Enter your age");
		int age = 30;
		System.out.println("Enter your designation");
		String designation = "Software Developer";
		System.out.println("Hi, " + name + ". Your age "
				+ "is " + age + " and your designation is " + designation);
	}
}
