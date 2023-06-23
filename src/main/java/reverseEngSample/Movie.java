package reverseEngSample;

public class Movie {

	private String name;

	private MovieType movieType;

	public Movie(String name, int priceCode) {
		this.name = name;
		this.movieType = MovieType.getInstance(priceCode);

	}

	public String getName() {
		return this.name;
	}

	// step 02: remove switch statements smell, move getLineAmount to Movie and remove switch statements smell
	public int getLineAmount(int daysRented) {
		return movieType.getLineAmount(daysRented);
	}

	// step 03: movie calc bonus points logic to Movie
	public int getBonusPoints(int daysRented) {
		return movieType.getBonusPoints(daysRented);
	}
}
