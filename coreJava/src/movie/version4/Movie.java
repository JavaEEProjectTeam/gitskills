package movie.version4;
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
	/**
	 * 计算价钱
	 * @param result
	 * @param rental TODO
	 * @return
	 */
	public double getPrice(int days) {
		double result = 0;
		switch (this.getPriceCode()) {
		case Movie.NEW_MOVIE:
			result = days * 3;
			break;
		case Movie.CHILLDREN_MOVIE:
			if (days <= 3)
				result = 1.5;
			else
				result = (days- 3) * 1.5 + 1.5;
			break;
		case Movie.R_MOVIE:
			if (days <= 3)
				result = 2;
			else
				result = (days - 3) * 2 + 1.5;
		}
		return result;
	}
	/**
	 * 获取积分
	 * @param fre
	 * @param rental TODO
	 * @return
	 */
	public int getFre(int days) {
		if (this.getPriceCode() == Movie.NEW_MOVIE
				&& days > 1)
			return 2;
		return 1;
	}
}
