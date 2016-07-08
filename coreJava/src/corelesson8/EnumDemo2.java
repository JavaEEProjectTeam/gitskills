package corelesson8;

public class EnumDemo2 {
	public static void main(String[] args) {
		System.out.println(Sex.MAN);
		System.out.println(Sex.WOMAN);

	}
}
enum Sex{
	MAN{
		@Override
		public String toString() {
			return "ÄÐ";
		}
	},WOMAN{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Å®";
		}
	}
}
