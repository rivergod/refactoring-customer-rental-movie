package reverseEngSample;

public class Movie {

	private String name;
//    private int priceCode;

	private MovieType movieType;

//    public Movie() {
//    }

	public Movie(String name, int priceCode) {
		this.name = name;
		this.movieType = MovieType.getInstance(priceCode);

	}

	public String getName() {
		return this.name;
	}

	public int getPriceCode() {
		return movieType.getPriceCode();
	}

//    public void setPriceCode(int priceCode) {
//        this.priceCode = priceCode;
//    }


	// step 02: remove switch statements smell, move getLineAmount to Movie and remove switch statements smell
	public int getLineAmount(int daysRented) {
		return movieType.getLineAmount(daysRented);
	}
}
