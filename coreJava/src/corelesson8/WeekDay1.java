package corelesson8;

public abstract class WeekDay1 {
	public static final WeekDay1 MON = new WeekDay1(){
		public WeekDay1 nextDay() {
			return TUE;
		}
		public String toString() {
			return "星期一";
		}
	};
	public static final WeekDay1 TUE = new WeekDay1(){
		public WeekDay1 nextDay() {
			return WED;
		}
		public String toString() {
			return "星期二";
		}
	};
	public static final WeekDay1 WED = new WeekDay1(){
		public WeekDay1 nextDay() {
			return THU;
		}
		public String toString() {
			return "星期三";
		}
	};
	public static final WeekDay1 THU  = new WeekDay1(){
		public WeekDay1 nextDay() {
			return FRI;
		}
		public String toString() {
			return "星期四";
		}
	};
	public static final WeekDay1 FRI  = new WeekDay1(){
		public WeekDay1 nextDay() {
			return SAT;
		}
		public String toString() {
			return "星期五";
		}
	};
	public static final WeekDay1 SAT = new WeekDay1(){
		public WeekDay1 nextDay() {
			return SUN;
		}
		public String toString() {
			return "星期六";
		}
	};
	public static final WeekDay1 SUN = new WeekDay1(){
		public WeekDay1 nextDay() {
			return MON;
		}
		public String toString() {
			return "星期日";
		}
	};
	private WeekDay1(){}
	public abstract WeekDay1 nextDay();
}
