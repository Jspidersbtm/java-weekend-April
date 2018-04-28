package com.methodoverridingexample.inputdeviceexample;

public class KeyBoard extends InputDevice {
	@Override
	public void select() {
		System.out.println("Press the enter key to select");
	}
}
