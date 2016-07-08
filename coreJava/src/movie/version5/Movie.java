package movie.version5;
/*
 * 电影类
 */
public class Movie {
	private String name;
	private Price price;
	public Movie(){}
	public Movie(String name){
		this.name = name;
	}
	public static final int NEW_MOVIE = 1;//代表新电影
	public static final int CHILLDREN_MOVIE=2;//儿童电影
	public static final int R_MOVIE = 3;//普通电影
	private int priceCode;//代表了将来是哪种电影
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	public int getPriceCode() {
		return priceCode;
	}
	public String getName() {
		return name;
	}
	/**
	 * 计算价钱
	 * @param result
	 * @param rental TODO
	 * @return
	 */
	public double getPrice(int days) {
		switch (this.getPriceCode()) {
		case Movie.NEW_MOVIE:
			price = new NewMoviePrice();
			break;
		case Movie.CHILLDREN_MOVIE:
			price = new ChildrenMoviePrice();
			break;
		case Movie.R_MOVIE:
		   price = new RMoviePrice();
		}
		return price.getPrice(days);
	}
	/**
	 * 获取积分
	 * @param fre
	 * @param rental TODO
	 * @return
	 */
	public int getFre(int days) {
		return price.getFre(days);
	}
}
