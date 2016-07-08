package corelesson3;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		User user1 = new User("zhangsan", "1234", 20);
		User user2 = new User("lisi","3456",22);
		User user3 = new User("wangwu","1234",20);
		TreeSet<User> ts = new TreeSet<User>();
		ts.add(user1);
		ts.add(user2);
		ts.add(user3);
		System.out.println(ts);
	}

}
