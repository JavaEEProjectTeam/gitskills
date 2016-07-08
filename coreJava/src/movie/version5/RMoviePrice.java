package movie.version5;

public class RMoviePrice extends Price{

	@Override
	public double getPrice(int days) {
		if (days <= 3)
			return 2;
		return  (days - 3) * 1.5 + 2;
	
	}

}
