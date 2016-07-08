package movie;

public class Customer {
	private String name;
	private Rental[] rs = new Rental[5];
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
	public void addRental(Rental rental) {
		rs[index++] = rental;
	}

	/**
	 * 打印金额、积分情况
	 */
	public void printMssage() {
		double totalPrice = 0;
		double result = 0;
		int fre = 0;
		// 小于index
		for (int i = 0; i < index; i++) {
			Rental r = rs[i];
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
			totalPrice += result;
			fre++;
			if (r.getMovie().getPriceCode() == Movie.NEW_MOVIE
					&& r.getDays() > 1)
				fre++;
		}
		System.out.println(this.name + "您消费的金额是:" + totalPrice + "您这次所获得的积分是:"
				+ fre);
	}

}
