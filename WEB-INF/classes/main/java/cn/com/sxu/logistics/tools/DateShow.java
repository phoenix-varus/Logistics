package main.java.cn.com.sxu.logistics.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateShow {
	public String s = null;

	public String dateShow() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		s = df.format(date.getTime());
		System.out.println(s);
		System.out.println("haha");
		return s;
	}
}
