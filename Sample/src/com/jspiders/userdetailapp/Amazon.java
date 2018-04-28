package com.jspiders.userdetailapp;

public class Amazon {
	void pay(CreditCard c) {
		System.out.println("Paid with credit card");
	}

	void pay(DebitCard d) {
		System.out.println("paid with debit card");
	}


	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.pay(new CreditCard());
	}
}
