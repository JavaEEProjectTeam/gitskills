package corelesson2;

import java.lang.reflect.Method;

public class ArrayReflectDemo2 {
	public static void main(String[] args) {
		try {
			Class c = C.class;
			Method m = c.getMethod("test", new Class[] { String[][].class,
					int[].class, double[].class, int.class });
			
			m.invoke(c.newInstance(), new Object[] { new String[][] {},
					new int[] {}, new double[] {}, 10});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class C {
	public void test(String[][] str, int[] a, double[] c, int x) {
		System.out.println("²âÊÔÊý×éµÄ");
	}
}
