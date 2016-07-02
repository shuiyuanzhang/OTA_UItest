package ota_test;

public class TestSuit {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//启动桌面启动应用50次
		String appActivityName = ota_test.OTA_ActivityName.getActivityName();
		try {
			System.out.println("启动桌面启动应用");
			for(int i=0;i<50;i++){
				StartTest.start(appActivityName);
				Sleep.time(2000);
			}
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("启动应用有异常");
		}

		
		//设置进入应用
		try {
			System.out.println("从设置中启动应用");
			StartTest.settings_start();
			Sleep.time(2500);
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("从设置中启动应用有异常");
		}

		
		//滑动更新详情
		StartTest.start(appActivityName);
		Sleep.time(2500);
		try {
			System.out.println("滑动更新详情 100次");
			for(int i=0;i<100;i++){
				SwipeTital.swipe();
				Sleep.time(500);
			}
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("滑动更新详情有异常");
		}

		
		//左上角退出应用
		StartTest.settings_start();
		Sleep.time(2500);
		try {
			System.out.println("左上角退出应用");
			Tap.key(50, 70);			
		} catch (Exception e) {
			// TODO: handle exception
			Screenshot.picture();
			System.out.println("退出应用失败");
		}
		
		
		//点击“more”
		StartTest.start(appActivityName);
		Sleep.time(3500);
		try {
			Screenshot.picture();
			System.out.println("点击“more”");
			Tap.key(80, 720);
		} catch (Exception e) {
			// TODO: handle exception
			Screenshot.picture();
			System.out.println("无法展开更多详情");
		}
		
		
		//下载
		StartTest.start(appActivityName);
		Sleep.time(4500);
		try {
			System.out.println("下载");
			Sleep.time(2500);
			Tap.key(200, 800);
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//暂停
		try {
			System.out.println("暂停");
			Sleep.time(4500);
			Tap.key(240, 800);
			Screenshot.picture();
			Sleep.time(4500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//继续
		try {
			System.out.println("继续");
			Tap.key(400, 800);
			Sleep.time(2500);		
			Screenshot.picture();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//取消停止下载
		try {
			System.out.println("取消停止下载");
			Tap.key(400, 800);
			Sleep.time(2500);
			Tap.key(235, 780);
			Sleep.time(1500);
			Tap.key(200, 780);
			Screenshot.picture();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("取消下载出错");
		}
		
		//停止下载
		try {
			Sleep.time(1500);
			Tap.key(100, 800);
			Sleep.time(1500);
			Screenshot.picture();
			Tap.key(300, 798);
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		//进入本地升级界面
		StartTest.start(appActivityName);
		try {
			System.out.println("进入本地升级界面");
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
