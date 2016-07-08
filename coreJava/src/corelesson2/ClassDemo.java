package corelesson2;

public class ClassDemo {
	public static void main(String[] args) {
		A a1 = new A();
		/*表示了A类的类类型--->A类本事也是一个对象
		 * 分析一下：也可以认为是字节码（自己理解的)
		 */
		Class c1 = A.class;//任何一个类都有一个隐含的静态的成员变量class
		Class c2 = a1.getClass();
		//c1 c2都表示了一个对象这个对象代表A这个类
		/*
		 * 一个类就是Class类的一个对象
		 * 我们把这个对象称为类的类类型，也称为类的字节码
		 * 不管是c1 c2都代表了A类的类类行
		 */
		System.out.println(c1==c2);
		Class c3 = null;
		try {
			/*这种表示方式也代表了动态加载类
			 * 动态加载类是指在运行时刻加载类
			 * 而非编译时刻
			 */
			 c3 = Class.forName("corelesson2.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		/*我们能不能通过类类型，直接获取类的对象
		 * 通过c1,c2 or c3直接获取A类的对象
		 */
		try {
			/*会调用无参数的构造方法来产生对象
			 * 返回Object需要做强制类型转换
			 */
			A aa =(A) c1.newInstance();
			aa.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("======================");
		test("hello");
		System.out.println("===================");
		//String 类的类类型如何表示
		Class cc1 = String.class;
		Class cc2 = "hello".getClass();
		Class cc3 = null;
		try {
			cc3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cc1==cc2);
		
	}
	public static void test(Object obj){
		//传递的是哪个子类的对象获取的，就是其子类的类类型
		Class c = obj.getClass();
		//获取类名
	    System.out.println(c.getName());
	}
	
}
class A{
	void test(){System.out.println("hello");}
}
