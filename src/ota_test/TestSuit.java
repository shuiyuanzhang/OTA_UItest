package ota_test;

public class TestSuit {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//������������Ӧ��
//		System.out.println(ota_test.OTA_ActivityName.getActivityName());
		String appActivityName = ota_test.OTA_ActivityName.getActivityName();
//		for(int i=1;i<50;i++){
//			System.out.println(i);
//			StartTest.start(appActivityName);
//			Sleep.time(2000);
//		}
		
//		//���ý���Ӧ��
//		StartTest.settings_start();
//		Sleep.time(2500);
//		Screenshot.picture();
		
//		//���Ͻ��˳�Ӧ��
//		StartTest.settings_start();
//		Sleep.time(2500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 50 70");			
//		} catch (Exception e) {
//			// TODO: handle exception
//			Screenshot.picture();
//			System.out.println("�˳�Ӧ��ʧ��");
//		}
		
		
//		//�����more��
//		StartTest.start(appActivityName);
//		Sleep.time(3500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 80 720");
//		} catch (Exception e) {
//			// TODO: handle exception
//			Screenshot.picture();
//			System.out.println("�޷�չ����������");
//		}
		
		
		//����
//		StartTest.start(appActivityName);
//		Sleep.time(4500);
//		try {
//			Runtime.getRuntime().exec("adb shell input tap 200 800");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		//��ͣ
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
		
		//����
//		try {
//			Screenshot.picture();
//			Runtime.getRuntime().exec("adb shell input tap 400 800");
//			Sleep.time(2500);			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//ֹͣ����
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
		
		//ȡ��ֹͣ����
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
		
		
		
		
//		//������������
//		for(int i=0;i<100;i++){
//			SwipeTital.swipe();
//			Sleep.time(500);
//			System.out.println(i);
//		}
		
		
		
		
	}

}
