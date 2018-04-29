package com.mr.fruitexampleupcastingdowncasting;

public class Person {
	void fillHunger() {
		Shop s = new Shop();
		Object o = s.sell();
		if (o != null) {

			if (o instanceof Apple) {
				Apple a = (Apple) o;
				a.prepareSalad();
			} else if (o instanceof StrawBerry) {
				StrawBerry st = (StrawBerry) o;
				st.prepareMilkShake();
			} else if (o instanceof WaterMelon) {
				WaterMelon w = (WaterMelon) o;
				w.prepareJuice();
			} else if (o instanceof Chilli) {
				Chilli c = (Chilli) o;
				c.preparePickle();
			}
		} else {
			System.out.println("No object at this time");
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.fillHunger();
	}
}
