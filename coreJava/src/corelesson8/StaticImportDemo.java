package corelesson8;

import java.util.Calendar;
//import static java.lang.Math.PI;
import static java.lang.Math.*;
import static java.util.Calendar.getInstance;
public class StaticImportDemo {
	public static void main(String[] args) {
		/*System.out.println(Math.PI);
		Calendar c = Calendar.getInstance();*/
		System.out.println(PI);
		Calendar c = getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(abs(-10));
		System.out.println(random()*100);
	}
}
