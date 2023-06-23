package reverseEngSample;

public class Rental {
	private int daysRented;
	private Movie movie;

	Rental() {
	}

	public Rental(int days, Movie myMovie) {
		setMovie(myMovie);
		setDaysRented(days);
	}

	public int getDaysRented() {
		return this.daysRented;
	}

	private void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return this.movie;
	}

	private void setMovie(Movie movie) {
		this.movie = movie;
	}

	// step 01: remove switch statements smell, move getLineAmount to rental
	// step 02: remove switch statements smell, move getLineAmount to Movie and remove switch statements smell
	public int getLineAmount() {
		return movie.getLineAmount(daysRented);
	}

	public int getBonusPoints() {
		return movie.getBonusPoints(daysRented);
	}

}