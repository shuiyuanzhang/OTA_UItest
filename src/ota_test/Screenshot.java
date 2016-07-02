package ota_test;

import java.io.IOException;

public class Screenshot {
	public static void picture() {
		
		
		try {
			Runtime.getRuntime().exec("adb shell screencap -p /sdcard/screen"+System.currentTimeMillis()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("½ØÍ¼Ê§°Ü");
		}
	}
}
