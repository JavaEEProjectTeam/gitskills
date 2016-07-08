package corelesson3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		User1 user1 = new User1("zhangsan","12343",30);
		User1 user2 = new User1("lisi","23344",22);
		User1 user3 = new User1("wangwu","1233444",33);
		TreeSet<User1> ts = new TreeSet<User1>(new MyComparator());
		ts.add(user1);
		ts.add(user2);
		ts.add(user3);
		System.out.println(ts);
		
		System.out.println("================");
		TreeSet<User1> ts1 = new TreeSet<User1>(new Comparator<User1>() {

			@Override
			public int compare(User1 o1, User1 o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		});
		ts1.add(user1);
		ts1.add(user2);
		ts1.add(user3);
		System.out.println(ts1);
	}
	static class MyComparator implements Comparator<User1>{

		@Override
		public int compare(User1 o1, User1 o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
			
		}
		
	}

}
