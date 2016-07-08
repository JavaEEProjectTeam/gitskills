package corelesson5;

public class UserService {
	private static ThreadLocal<UserService> tl = new ThreadLocal<UserService>();
	private UserService(){}
	public static UserService getInstance(){
		UserService us = tl.get();
		if(us==null){
			us = new UserService();
			tl.set(us);
		}
		return us;
	}
}
