package com.windows.windowsauthenticationapp.login;

public class OperatingSystem {
	void authenticate(PicturePassword p) {
		System.out.println("Logged in with picute password");
	}

	void authenticate(Voice v) {
		System.out.println("Logged in with voice");
	}

	void authenticate(int pin) {
		System.out.println("Logged in with pin");
	}

	void authenticate(String password) {
		System.out.println("Logged in with password");
	}

	public static void main(String[] args) {
		OperatingSystem os = new OperatingSystem();
		os.authenticate(1234);

		// PicturePassword p = new PicturePassword();
		// os.authenticate(p);

		// os.authenticate(new Voice());

		// os.authenticate("xyz@123");
	}

}
