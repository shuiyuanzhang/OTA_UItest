package ota_test;

public class Sleep {
	public static void time(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ïß³Ì×èÈûÁË~~");
		}
	}
}
