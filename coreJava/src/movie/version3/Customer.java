package movie.version3;

public class Customer {
	private String name;
	private MyArrayList list = new MyArrayList();
	private int index = 0;

	public Customer() {
	}
	public Customer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void add(Rental rental) {
		if(rental==null)return;
		if(list.contains(rental))return;
		list.add(rental);
	}
	/**
	 * 打印金额、积分情况
	 */
	public void printMssage() {
		double totalPrice = 0;
		int fre = 0;
		Iterator iterator = list.iterator();// 获取迭代器
		while (!iterator.isDone()) {
			Rental r = (Rental) iterator.getCurrent();
			totalPrice += getPrice(r);
			fre+=getFre(r);
			iterator.next();
		}
		System.out.println(this.name + "您消费的金额是:" + totalPrice + "您这次所获得的积分是:"
				+ fre);

	}
	/**
	 * 获取积分
	 * @param fre
	 * @param r
	 * @return
	 */
	private int getFre(Rental r) {
		if (r.getMovie().getPriceCode() == Movie.NEW_MOVIE
				&& r.getDays() > 1)
			return 2;
		return 1;
	}
	/**
	 * 计算价钱
	 * @param result
	 * @param r
	 * @return
	 */
	private double getPrice(Rental r) {
		double result = 0;
		switch (r.getMovie().getPriceCode()) {
		case Movie.NEW_MOVIE:
			result = r.getDays() * 3;
			break;
		case Movie.CHILLDREN_MOVIE:
			if (r.getDays() <= 3)
				result = 1.5;
			else
				result = (r.getDays() - 3) * 1.5 + 1.5;
			break;
		case Movie.R_MOVIE:
			if (r.getDays() <= 3)
				result = 2;
			else
				result = (r.getDays() - 3) * 2 + 1.5;
		}
		return result;
	}

}
