package corelesson2;

import java.lang.reflect.Method;

public class ArrayReflectDemo3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		Integer[] b = { 1, 2, 3, 4 };
		Object o1 = a;// ok
		// Object[] o2 = a;//错误
		Object o2 = b;// 把数组当做是一个对象
		Object[] o3 = b;// 把里面的每个Integer当做对象
		String[][] ss = { { "aa", "bb" }, { "cc", "dd" } };
		Object o4 = ss;// ok 把整个二维数组看做是一个对象
		Object[] o5 = ss;// ok 把其中的每个一维数组当做一个对象
		Object[][] o6 = ss;// ok,把其中的每个字符串当做一个对象
		System.out.println("=========================");
		MainTest.main(new String[] { "hello", "world" });
		Object[] o = new String[] { "hello", "world" };
		Object oo = new String[] { "hello", "world" };
		// 通过main方法的反射来操作
		try {
			Method m = MainTest.class.getMethod("main",
					new Class[] { String[].class });
			//m.invoke(null, new Object[]{new String[] { "hello", "world" }}); //ok
			//该调用中默认认为Object类型的一维数组，下面的语句会报错
			m.invoke(null,new String[] { "hello", "world" });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MainTest {
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
}