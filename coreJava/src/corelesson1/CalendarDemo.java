package corelesson1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	private static void test1() {
		//Calendar是抽象类，获取的是其子类的对象
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//获取所有跟时间相同的信息
	}
	private static void test2(){
		String s = "1998-10-10";
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		c.setTimeInMillis(date.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		
	}
	//输入雇佣日期，获取转正日期--->三个月转正
	private static void test3(){
		//雇佣日期
	    String s = "1998-10-10";
	    Date date = DateDemo.stringToDate(s);
	    Calendar c = Calendar.getInstance();
	    c.setTime(date);
	    //转正日期
	    c.add(Calendar.MONTH, 3);
	    int y = c.get(Calendar.YEAR);
	    int m = c.get(Calendar.MONTH)+1;
	    int d= c.get(Calendar.DATE);
	    System.out.println("转正日期是:"+y+"-"+m+"-"+d);
	    
	    
	}
}
