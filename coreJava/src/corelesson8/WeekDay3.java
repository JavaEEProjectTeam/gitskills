package corelesson8;
public enum WeekDay3 {
	MON{
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return TUE;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期一";
		}
	},TUE{
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return WED;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期二";
		}
	},
	WED(){
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return THU;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期三";
		}
	},
	THU(){
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return FRI;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期四";
		}
	},
	FRI(5){

		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return SAT;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期五";
		}
		
	},
	SAT(6){

		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return SUN;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期六";
		}
		
	},
	SUN(7){

		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return MON;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期天";
		}
		
	};
	private WeekDay3(){}
	private WeekDay3(int n){}
	public abstract WeekDay3 nextDay();

}