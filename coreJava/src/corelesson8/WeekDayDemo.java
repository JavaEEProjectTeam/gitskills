package corelesson8;

public class WeekDayDemo {
	public static void main(String[] args) {
		WeekDay wd = WeekDay.MON;
		System.out.println(wd);
		System.out.println(wd.nextDay());
		System.out.println("==============");
		WeekDay1 day1 = WeekDay1.MON;
		System.out.println(day1);
		System.out.println(day1.nextDay());
	}

}
