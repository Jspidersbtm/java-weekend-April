package com.pokemon.playapp.upcastingexample;

import java.util.Random;

public class PokeBall {
	Pokemon givePokemon() {
		Random r = new Random();
		int n = r.nextInt(5) + 1;
		if (n == 1) {
			return new Pickachu();
		} else if (n == 2) {
			return new Charmander();
		} else if (n == 3) {
			return new Bulbazar();
		} else
			return null;
	}
}