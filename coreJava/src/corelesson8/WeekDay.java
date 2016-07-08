package corelesson8;

public class WeekDay {
	public static final WeekDay MON = new WeekDay();
	public static final WeekDay TUE = new WeekDay();
	public static final WeekDay WED = new WeekDay();
	public static final WeekDay THU  = new WeekDay();
	public static final WeekDay FRI  = new WeekDay();
	public static final WeekDay SAT = new WeekDay();
	public static final WeekDay SUN = new WeekDay();
	private WeekDay(){}
	public WeekDay nextDay(){
		if(this.equals(MON))
			return TUE;
		else if(this.equals(TUE))
			return WED;
		else if(this.equals(WED))
			return THU;
		else if(this.equals(THU))
			return FRI;
		else if(this.equals(FRI))
			return SAT;
		else if(this.equals(SAT))
			return SUN;
		else 
			return MON;
	}
	public String toString(){
		if(this.equals(MON))
			return "星期一";
		else if(this.equals(TUE))
			return "星期二";
		else if(this.equals(WED))
			return "星期三";
		else if(this.equals(THU))
			return "星期四";
		else if(this.equals(FRI))
			return "星期五";
		else if(this.equals(SAT))
			return "星期六";
		else 
			return "星期天";
	}
}
