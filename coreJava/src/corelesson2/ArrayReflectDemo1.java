package corelesson2;

import java.lang.reflect.Method;

public class ArrayReflectDemo1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }; // a是一个对象 那么这个对象的类类型？如何表示？
		Class c = a.getClass();
		System.out.println(c.getName());

		int[] b = { 2, 3, 4, 5, 6 };
		Class c1 = b.getClass();
		System.out.println(c1.getName());

		System.out.println(int[].class == c1);// 数组的类类型只根数组的类型和维数有关
		String[][] ss = { {}, {} };
		System.out.println(String[][].class == ss.getClass());
		// 获取test方法
		Class c2 = B.class;
		try {
			Method method = c2.getMethod("test", new Class[] { String[].class,
					int[].class });
			method.invoke(c2.newInstance(), new Object[] {
					new String[] { "hello", "world" }, new int[] { 10, 20 } });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class B {
	public void test(String[] a, int[] b) {
		for (int i : b) {
			System.out.println(i);

		}
		for (String str : a) {
			System.out.println(str);
		}
	}
}
