package ota_test;

import java.io.IOException;

public class StartTest {
	public static void start(String appActivityName) {
		try {
			Runtime.getRuntime().exec("adb shell am start -S -W -n "+appActivityName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void settings_start() {
		try {
			Runtime.getRuntime().exec("adb shell am start -n com.android.settings/.Settings");
			Sleep.time(1000);
			Runtime.getRuntime().exec("adb shell input swipe 50 600 50 50 100");
			Sleep.time(1000);
			Runtime.getRuntime().exec("adb shell input tap 50 800 ");
			Sleep.time(1000);
			Runtime.getRuntime().exec("adb shell input tap 100 280");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
