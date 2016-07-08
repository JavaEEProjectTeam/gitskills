package corelesson1;

import java.util.Calendar;
import java.util.Date;

public class SystemDemo {
	public static void main(String[] args) {
		System.out.println("helloworld");
		System.out.println(new Date().getTime());
		System.out.println(System.currentTimeMillis());
		//System.exit(0);//程序退出  0代表正常退出，如果其它值代表非正常退出
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(System.currentTimeMillis());
		System.out.println(c.get(Calendar.YEAR));
		
		
	}

}
