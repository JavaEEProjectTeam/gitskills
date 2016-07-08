package corelesson2;

import java.lang.reflect.Method;

public class MethodReflectDemo {
	public static void main(String[] args) {
		/*
		 * 获取方法对象---->某一个方法 获取一个方法应该由方法名称和参数列表来决定 getMethod(方法名称，参数的类类型)
		 */
		MethodTest mt = new MethodTest();
		Class c = mt.getClass();
		try {
			Method method = c.getMethod("f",
					new Class[] { int.class, int.class });
			mt.f(10, 10);// mt调用其f方法
			System.out.println("=======================");
			/*
			 * 能不能够直接通过method对象直接调用方法效果和mt.f(10,10)等价 这就是方法反射要做的事情
			 * method.invoke(操作的对象，参数)
			 */
			method.invoke(mt, new Object[] { 10, 10 });// 和mt.f(10,10)等价

			System.out.println("=====================");
			Method method2 = c.getMethod("f", new Class[] { int.class,
					int.class, int.class });
			System.out.println(mt.f(10, 10, 10));
			// 通过method2直接操作
			int result = (Integer) method2.invoke(mt,
					new Object[] { 10, 10, 10 });
			System.out.println(result);

			System.out.println("=============================");
			String s1 = "hello";
			String s2 = "world";
			System.out.println(s1.concat(s2));
			/*
			 * 用concat方法的反射来操作 首先获取String类类型
			 */
			Class c1 = s1.getClass();// String.class s2.getClass()
			// 获取concat
			Method concatMethod = c1.getMethod("concat",
					new Class[] { String.class });
			String ss = (String)concatMethod.invoke(s1, new Object[]{s2});
			System.out.println(ss);
			System.out.println("==========================");
			Method fmethod = c.getMethod("f", new Class[]{});
			fmethod.invoke(mt, new Object[]{});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MethodTest {
	public void f(){
		System.out.println("helloworld");
	}
	public void f(int a, int b) {
		System.out.println(a + b);
	}

	public int f(int a, int b, int c) {
		System.out.println("三个数字相加");
		return a + b + c;
	}
}
