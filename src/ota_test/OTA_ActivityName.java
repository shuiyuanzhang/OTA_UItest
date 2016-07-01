package ota_test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OTA_ActivityName {

	public static String getActivityName() throws Throwable {
		// ‰»Î¥˝≤‚ ‘µƒactivityname
		String packageName="tran.com.android.taplaota";
		Process aProcess =Runtime.getRuntime().exec("adb shell dumpsys package "+packageName);
		InputStream in = aProcess.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String ActivityName=null;
		while ((ActivityName= br.readLine())!=null) {
			if (ActivityName.endsWith("Activity")){
				String aString= ActivityName.trim().split(" ")[1];
				return aString;
			}
		}
		br.close();
		return null;	
}
}
