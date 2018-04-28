package com.methodoverridingexample.inputdeviceexample;

public class TestInputDevice {
	public static void main(String[] args) {
		InputDevice id = new Mouse();
		id.select();
		if (id instanceof Mouse) {
			Mouse m = (Mouse) id;
			m.scroll();
		}
	}
}
