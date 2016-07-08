package corelesson8;

import java.util.HashMap;

public class AutoBoxDemo {
	public static void main(String[] args) {
		Integer n1 = 1;//自动装箱   1会包装成Integer类的实例对象
		Integer n2 = new Integer(10);//n2.intValue();
		int a = n2;//自动拆箱,n2实例对象会自动转换成int的10
		
		/*自动装箱对于byte  int  long short  -128到127之间
		 * 对于char 0 到127之间存在享元模式
		 */
		Integer n9 = 10;
		Integer n10 = 10;
		
		Integer n11 = 128;
		Integer n12 = 128;
		
		Integer n13 = Integer.valueOf("11");
		Integer n14 = Integer.valueOf("11");

		/*
		 * 用了享元模式
		 * 
		 */
		System.out.println(n9==n10);
		System.out.println((n13==n14)+"...");
		/*
		 * 没有使用享元模式
		 */
		System.out.println(n11==n12);
		
		System.out.println("==================");
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		//map中key/value都必须是对象
		hm.put("a", 1);//自动装箱
		int x = hm.get("a");//自动拆箱
	}
}
