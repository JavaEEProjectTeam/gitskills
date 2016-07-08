package corelesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		User2 u1 = new User2("0001", "zhangsan", 20, "1234");
		User2 u2 = new User2("0002","lisi",21,"12345");
		User2 u3 = new User2("0003","wangwu",20,"123456");
		HashMap<String, User2> users = new HashMap<String,User2>();
		users.put(u1.getId(),u1);
		users.put(u2.getId(), u2);
		users.put(u3.getId(), u3);
		
		Set<String> set = users.keySet();
		for(String key : set){
			System.out.println(key+"="+users.get(key));
		}
		System.out.println("===================");
		Set<Map.Entry<String, User2>> set1 = users.entrySet();
		for(Map.Entry<String, User2> me : set1){
			System.out.println(me.getKey()+"="+me.getValue());
		}
		
		
		
		
	}

}
