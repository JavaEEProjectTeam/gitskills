package movie.version4;
public class MovieTest {
	public static void main(String[] args) {
		//创建影片
		Movie m1 = new Movie("我们曾经是战士");
		m1.setPriceCode(Movie.R_MOVIE);
		
		Movie m2 = new Movie("喜洋洋和灰太狼");
		m2.setPriceCode(Movie.CHILLDREN_MOVIE);
		
		Movie m3 = new Movie("全民目击");
		m3.setPriceCode(Movie.NEW_MOVIE);
		
		//用户信息
		Customer c1 = new Customer("沃赢");
		//租赁信息
		Rental r1 = new Rental(m1, 2);
		Rental r2 = new Rental(m2,3);
		Rental r3 = new Rental(m3,3);
		//给用户添加租赁
		c1.add(r1);
	    c1.add(r2);
	    c1.add(r3);
	    c1.add(r1);
	    c1.printMssage();
	}

}
