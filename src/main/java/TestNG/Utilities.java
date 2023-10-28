package TestNG;

import java.util.Date;

public class Utilities {
	

	public static final int implicitWait=5;
	
	public static String timeStamp() {
		Date d = new Date();
		String timeStamp = d.toString().replace(" ", "_").replace(":", "_");
		return timeStamp;
	}

}
