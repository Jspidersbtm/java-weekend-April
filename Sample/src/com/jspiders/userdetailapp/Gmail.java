package com.jspiders.userdetailapp;

public class Gmail {
	void login(String userName, String password) {
		System.out.println("Logged in with details " + userName + " " + password);
	}

	void login(long phoneNo, String password) {
		System.out.println("Logged in with details " + phoneNo + " " + password);
	}

	public static void main(String[] args) {
		Gmail g = new Gmail();
		g.login(1234567897989l, "Xyz");
	}

}
