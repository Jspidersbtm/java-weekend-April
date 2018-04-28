package com.amazon.methodexample;

public class Amazon {
	int sessionID;
	static String protocol = "HTTPS";

	void signUp() {
		System.out.println(sessionID + " " + protocol);
	}

	static void pay() {
		Amazon a = new Amazon();
		System.out.println(a.sessionID + " " + protocol);
	}

	public static void main(String[] args) {
		Amazon.pay();
	}
}
