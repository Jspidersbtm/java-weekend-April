package com.samsung.mobilemanufacture;

public class SampleFor {
	static void checkIsPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println(n + " is not a prime no");
		} else
			System.out.println(n + " is a prime no");
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			checkIsPrime(i);
		}

	}
}
