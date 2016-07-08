package movie.version3;

public class Rental {
	private Movie movie;//租赁了哪个电影
	private int days;//租赁了多少天
	public Rental(){
	}
	public Rental(Movie movie, int days) {
		super();
		this.movie = movie;
		this.days = days;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.movie.getName()+"_"+this.getDays();
	}
}
