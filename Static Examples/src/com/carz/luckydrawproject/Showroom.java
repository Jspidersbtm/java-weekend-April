package com.carz.luckydrawproject;

import java.util.Random;

public class Showroom {
	Car luckyDraw() {
		Random r = new Random();
		int n = r.nextInt(3) + 1;
		if (n == 1) {
			return new Audi();
		} else if (n == 2) {
			return new BMW();
		} else
			return new Jaguar();
	}

	public static void main(String[] args) {
		Showroom s = new Showroom();
		Car c = s.luckyDraw();
		System.out.println(c);
	}
}
