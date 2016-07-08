package corelesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		User2 u1 = new User2("0001", "zhangsan", 20, "1234");
		User2 u2 = new User2("0002","lisi",21,"12345");
		User2 u3 = new User2("0003","wangwu",20,"123456");
		HashMap hm = new HashMap();
		hm.put(u1.getId(),u1);
		hm.put(u2.getId(), u2);
		hm.put(u3.getId(),u3);
		//键值对的个数
		System.out.println(hm.size());
		//直接打印Map对象会打印key的toString=value的toString
		System.out.println(hm);
		//key value都是Object     get(key)得到value
		User2 user = (User2)hm.get("0001");
		System.out.println(user);
		//是否包含某个key
		System.out.println(hm.containsKey("0002"));
		/*遍历方式1：把Map中所有的key都放入了Set集合中
		 * 然后遍历Set集合，得到key,通过key获取value
		 */
		Set set = hm.keySet();
		for(Object object : set){
			String key = (String)object;
			User2 u = (User2)hm.get(key);
			System.out.println(key+"="+u);
		}
		System.out.println("================");
		/*
		 * 遍历方式2
		 *  放入HashMap集合中的key,value其实都会被包装成
		 *  Map.Entry这个内部类的属性  
		 *  有一个键值对就存在一个Map.Entry的实例对象
		 *  通过entrySet()方法就可以把这些实例对象都放入Set集合中
		 *  遍历Set获取每个对象
		 */
		Set set1 = hm.entrySet();
		for(Object object:set1){
			Map.Entry me = (Map.Entry)object;
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
