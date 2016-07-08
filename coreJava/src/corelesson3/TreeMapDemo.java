package corelesson3;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
	    TreeMap<User, Integer> users = new TreeMap<User,Integer>();
		User user1 = new User("zhangsan", "1234", 20);
		User user2 = new User("lisi","3456",22);
		User user3 = new User("wangwu","1234",20);
		users.put(user1, 1);
		users.put(user2, 2);
		users.put(user3, 3);
		
		for(User user : users.keySet()){
			System.out.println(user+"="+users.get(user));
		}
		
		TreeMap<User, Integer> users1 = 
				  new TreeMap<User,Integer>(new Comparator<User>() {

					@Override
					public int compare(User o1, User o2) {
						// TODO Auto-generated method stub
						return o1.getName().compareTo(o2.getName());
					}
				 });
		users1.put(user1, 1);
		users1.put(user2, 2);
		users1.put(user3, 3);
		System.out.println(users1);
	}

}
