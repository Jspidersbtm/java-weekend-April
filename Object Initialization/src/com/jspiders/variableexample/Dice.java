package com.jspiders.variableexample;

import java.util.Random;

public class Dice {
	int throwDice() {
		Random r = new Random();
		int res = r.nextInt(6) + 1;
		return res;

		// return new Random().nextInt(6) + 1;
	}

	public static void main(String[] args) {
		Dice d = new Dice();
		int generatedNumber = d.throwDice();
		System.out.println(generatedNumber);
	}
}
