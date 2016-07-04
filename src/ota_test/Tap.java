package ota_test;

import java.io.IOException;

public class Tap {
	public static void  key(int x,int y) {
		try {
			Runtime.getRuntime().exec("adb shell input tap "+x+" "+y);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("点击报错");
		}
	}
	
	public static void swipe(int x,int y,int x1,int y1,int time) {
		try {
			Runtime.getRuntime().exec("adb shell input swipe "+x+" "+y+" "+x1+" "+y1+" "+time);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("点击报错");
		}
	}
}
