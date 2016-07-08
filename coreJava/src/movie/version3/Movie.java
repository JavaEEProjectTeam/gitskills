package movie.version3;
/*
 * 电影类
 */
public class Movie {
	private String name;
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
}
