package com.jspiders.userdetailapp;

public class Calculator {
	int add(int num1, int num2) {
		return num1 + num2;
	}

	double add(double d, double d2) {
		return d + d2;
	}

	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	int add(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(32, 28));
	}
}
