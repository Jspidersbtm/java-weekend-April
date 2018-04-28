package com.jspiders.userdetailapp;

import java.util.Scanner;

public class Assignement2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the details");
		String name = s.nextLine();
		String collegeName = s.nextLine();
		int age = s.nextInt();
		s.nextLine();
		String address = s.nextLine();
		System.out.println(name + " " + age + " " + collegeName + " " + address);
	}
}
