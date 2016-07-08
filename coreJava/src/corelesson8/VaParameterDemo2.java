package corelesson8;

import java.lang.reflect.Method;

public class VaParameterDemo2 {
	public static void main(String[] args) {
		try {
			A a = new A();
			Class c = a.getClass();
//			Method method = c.getMethod("f", new Class[]{});
//			method.invoke(a, new Object[]{});
			
			Method method = c.getMethod("f");
			method.invoke(a);
			System.out.println("============");
//			Method method1 = c.getMethod("f", new Class[]{int.class});
//			method1.invoke(a, new Object[]{10});
			
			Method method1 = c.getMethod("f", int.class);
			method1.invoke(a,10);
			System.out.println("==================");
//			Method method2 = c.getMethod("f", new Class[]{int.class,int.class,int.class});
//			method2.invoke(a, new Object[]{10,20,30});
			
			Method method2 = c.getMethod("f", int.class,int.class,int.class);
			method2.invoke(a, 10,20,30);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class A{
	public void f(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public void f(int a){
		System.out.println(a);
	}
	public void f(){
		System.out.println("helloworld");
	}

}
