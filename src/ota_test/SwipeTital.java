package ota_test;

import java.io.IOException;

public class SwipeTital {
	public static void swipe() {
		try {
			Runtime.getRuntime().exec("adb shell input swipe 300 500 300 60 100");
			Sleep.time(500);
			Runtime.getRuntime().exec("adb shell input swipe 300 60 300 500 100");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
