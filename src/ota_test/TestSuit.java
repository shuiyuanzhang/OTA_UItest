package ota_test;

public class TestSuit {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//������������Ӧ��50��
		String appActivityName = ota_test.OTA_ActivityName.getActivityName();
		try {
			System.out.println("������������Ӧ��");
			for(int i=0;i<50;i++){
				StartTest.start(appActivityName);
				Sleep.time(2000);
			}
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����Ӧ�����쳣");
		}

		
		//���ý���Ӧ��
		try {
			System.out.println("������������Ӧ��");
			StartTest.settings_start();
			Sleep.time(2500);
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("������������Ӧ�����쳣");
		}

		
		//������������
		StartTest.start(appActivityName);
		Sleep.time(2500);
		try {
			System.out.println("������������ 100��");
			for(int i=0;i<100;i++){
				SwipeTital.swipe();
				Sleep.time(500);
			}
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������������쳣");
		}

		
		//���Ͻ��˳�Ӧ��
		StartTest.settings_start();
		Sleep.time(2500);
		try {
			System.out.println("���Ͻ��˳�Ӧ��");
			Tap.key(50, 70);			
		} catch (Exception e) {
			// TODO: handle exception
			Screenshot.picture();
			System.out.println("�˳�Ӧ��ʧ��");
		}
		
		
		//�����more��
		StartTest.start(appActivityName);
		Sleep.time(3500);
		try {
			Screenshot.picture();
			System.out.println("�����more��");
			Tap.key(80, 720);
		} catch (Exception e) {
			// TODO: handle exception
			Screenshot.picture();
			System.out.println("�޷�չ����������");
		}
		
		
		//����
		StartTest.start(appActivityName);
		Sleep.time(4500);
		try {
			System.out.println("����");
			Sleep.time(2500);
			Tap.key(200, 800);
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//��ͣ
		try {
			System.out.println("��ͣ");
			Sleep.time(4500);
			Tap.key(240, 800);
			Screenshot.picture();
			Sleep.time(4500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//����
		try {
			System.out.println("����");
			Tap.key(400, 800);
			Sleep.time(2500);		
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//ȡ��ֹͣ����
		try {
			System.out.println("ȡ��ֹͣ����");
			Tap.key(400, 800);
			Sleep.time(2500);
			Tap.key(235, 780);
			Sleep.time(1500);
			Tap.key(200, 780);
			Screenshot.picture();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ȡ�����س���");
		}
		
		//ֹͣ����
		try {
			Sleep.time(1500);
			Tap.key(100, 800);
			Sleep.time(1500);
			Screenshot.picture();
			Tap.key(300, 798);
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		//���뱾����������
		StartTest.start(appActivityName);
		try {
			System.out.println("���뱾����������");
			Sleep.time(2500);
			Tap.key(456, 76);
			Sleep.time(1500);
			Tap.key(384, 129);
			Sleep.time(1500);
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
		}

		

		
		
		
		
	}

}
