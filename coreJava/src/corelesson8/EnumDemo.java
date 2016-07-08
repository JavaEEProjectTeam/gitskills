package corelesson8;


public class EnumDemo {

	public static void main(String[] args) {
		WeekDay2 day2 = WeekDay2.FRI;
		System.out.println("============");
		//枚举类本身提供了一些方法
		WeekDay2[] ws = WeekDay2.values();
		for (WeekDay2 weekDay2 : ws) {
			System.out.println(weekDay2);//toString默认就是枚举对象的名字
		}
		System.out.println("===================");
		WeekDay2 d1 = WeekDay2.valueOf("MON");
		System.out.println(d1);
		//switch case语法中可以使用byte short int long 和枚举类型
		System.out.println("====================");
		switch (d1) {
		case FRI:
			System.out.println("fri");
			break;
		case MON:
			System.out.println("mon");
			break;
		case SUN:
			System.out.println("sun");
			break;
		}
		System.out.println("====================");
		WeekDay3 d = WeekDay3.MON;
		System.out.println(d.nextDay());
	}

}
