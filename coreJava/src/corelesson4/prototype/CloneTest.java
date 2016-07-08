package corelesson4.prototype;

public class CloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Address address = new Address();
		user.setAddress(address);
		
		User user1 = null;
		User user2 = null;
		try {
			user1 = (User)user.clone();
			user2 = (User)user.deepClone();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(user==user1);
		System.out.println(user.getAddress()==user1.getAddress());
		System.out.println("================");
		System.out.println(user==user2);
		System.out.println(user.getAddress()==user2.getAddress());

	}

}
