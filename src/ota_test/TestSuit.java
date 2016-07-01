package ota_test;

public class TestSuit {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//启动桌面启动应用
//		System.out.println(ota_test.OTA_ActivityName.getActivityName());
		String appActivityName = ota_test.OTA_ActivityName.getActivityName();
//		for(int i=1;i<50;i++){
//			System.out.println(i);
//			StartTest.start(appActivityName);
//			Sleep.time(2000);
//		}
		
//		//设置进入应用
//		StartTest.settings_start();
//		Sleep.time(2500);
//		Screenshot.picture();
		
//		//左上角退出应用
//		StartTest.settings_start();
//		Sleep.time(2500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 50 70");			
//		} catch (Exception e) {
//			// TODO: handle exception
//			Screenshot.picture();
//			System.out.println("退出应用失败");
//		}
		
		
//		//点击“more”
//		StartTest.start(appActivityName);
//		Sleep.time(3500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 80 720");
//		} catch (Exception e) {
//			// TODO: handle exception
//			Screenshot.picture();
//			System.out.println("无法展开更多详情");
//		}
		
		
		//下载
//		StartTest.start(appActivityName);
//		Sleep.time(4500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 200 800");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		//暂停
//		StartTest.start(appActivityName);
//		Sleep.time(4500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 200 800");
//			Sleep.time(2500);
//			Screenshot.picture();
//			Runtime.getRuntime().exec("adb shell input tap 200 800");			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//继续
//		try {
//			Screenshot.picture();
//			Runtime.getRuntime().exec("adb shell input tap 400 800");
//			Sleep.time(2500);			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//停止下载
//		try {
//			Screenshot.picture();
//			Runtime.getRuntime().exec("adb shell input tap 400 800");
//			Sleep.time(1500);
//			Runtime.getRuntime().exec("adb shell input tap 100 800");
//			Sleep.time(1500);
//			Screenshot.picture();
//			Runtime.getRuntime().exec("adb shell input tap 300 790");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//取消停止下载
		StartTest.start(appActivityName);
		Sleep.time(4500);
		try {
			Runtime.getRuntime().exec("adb shell input tap 400 800");
			Sleep.time(1500);
			Runtime.getRuntime().exec("adb shell input tap 400 800");
			Sleep.time(1500);
			Runtime.getRuntime().exec("adb shell input tap 100 800");
			Sleep.time(1500);
			Runtime.getRuntime().exec("adb shell input tap 220 780");
			Sleep.time(1500);
			Runtime.getRuntime().exec("adb shell input tap 220 780");
			Screenshot.picture();			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
//		//滑动更新详情
//		for(int i=0;i<100;i++){
//			SwipeTital.swipe();
//			Sleep.time(500);
//			System.out.println(i);
//		}
		
		
		
		
	}

}
